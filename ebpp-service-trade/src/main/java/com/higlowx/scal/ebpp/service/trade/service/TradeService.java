package com.higlowx.scal.ebpp.service.trade.service;

import com.higlowx.scal.ebpp.service.trade.dao.TradeDao;
import com.higlowx.scal.ebpp.service.trade.entity.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Trade createTrade(BigDecimal amount) {
        Trade trade = new Trade();
        trade.setStatus(false);
        trade.setAmount(amount);
        tradeDao.insert(trade);
        return trade;
    }

    public String callback() {
        return null;
    }
}
