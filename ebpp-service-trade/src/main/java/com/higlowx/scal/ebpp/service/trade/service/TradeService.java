package com.higlowx.scal.ebpp.service.trade.service;

import com.higlowx.scal.ebpp.service.trade.dao.TradeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Dylan.Li
 * @date 2021/7/8
 * @since
 */
@Service
public class TradeService {

    @Autowired
    private TradeDao tradeDao;

    public String callback(){
        return null;
    }

}
