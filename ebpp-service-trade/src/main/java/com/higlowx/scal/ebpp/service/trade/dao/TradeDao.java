package com.higlowx.scal.ebpp.service.trade.dao;

import com.higlowx.scal.ebpp.common.utils.AssertUtils;
import com.higlowx.scal.ebpp.service.trade.entity.Trade;
import com.higlowx.scal.ebpp.service.trade.mybatis.mapper.SimpleTradeMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author Dylan.Li
 * @date 2021/7/8
 * @since
 */
@Repository
public class TradeDao {

    @Resource
    private SimpleTradeMapper mapper;

    public void insert(Trade row) {
        Date time = new Date();
        row.setCreateTime(time);
        row.setUpdateTime(time);
        int rows = mapper.insert(row);
        AssertUtils.isTrue(rows == 1);
    }
}
