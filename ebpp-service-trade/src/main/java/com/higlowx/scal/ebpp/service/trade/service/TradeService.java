package com.higlowx.scal.ebpp.service.trade.service;

import com.alibaba.fastjson.JSON;
import com.higlowx.scal.ebpp.common.res.UnifiedResponse;
import com.higlowx.scal.ebpp.common.utils.AssertUtils;
import com.higlowx.scal.ebpp.service.trade.dao.TradeDao;
import com.higlowx.scal.ebpp.service.trade.entity.Trade;
import com.higlowx.scal.ebpp.service.trade.rpc.BillClient;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @author Dylan.Li
 * @date 2021/7/8
 * @since
 */
@Service
public class TradeService {

    @Autowired
    private TradeDao tradeDao;
    @Autowired
    private BillClient billClient;

    public Trade createTrade(BigDecimal amount) {
        Trade trade = new Trade();
        trade.setStatus(false);
        trade.setAmount(amount);
        tradeDao.insert(trade);
        return trade;
    }

    @GlobalTransactional(rollbackFor = Throwable.class)
    public void paidTrade(Integer tradeId) {
        Trade trade = tradeDao.selectById(tradeId);
        AssertUtils.notNull(trade);
        UnifiedResponse<Object> billResult = billClient.create(trade.getAmount(), tradeId);
        System.out.println(JSON.toJSONString(billResult));
        AssertUtils.isTrue(billResult.success(), "调用账单系统创建账单失败");
        trade.setStatus(true);
        tradeDao.updateById(trade);
        //模拟异常导致分布式事务问题，观察bill和trade数据是否统一
        //int i = 1 / 0;
    }
}
