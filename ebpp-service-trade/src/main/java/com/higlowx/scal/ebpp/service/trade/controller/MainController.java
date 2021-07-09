package com.higlowx.scal.ebpp.service.trade.controller;

import com.higlowx.scal.ebpp.common.res.UnifiedResponse;
import com.higlowx.scal.ebpp.common.res.UnifiedResponseCode;
import com.higlowx.scal.ebpp.service.trade.entity.Trade;
import com.higlowx.scal.ebpp.service.trade.route.TradeMainRoute;
import com.higlowx.scal.ebpp.service.trade.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author Dylan.Li
 * @date 2021/7/8
 */
@RestController
public class MainController implements TradeMainRoute {

    @Autowired
    private TradeService tradeService;

    @Override
    public UnifiedResponse<Object> create(BigDecimal amount) {
        Trade trade = tradeService.createTrade(amount);
        return UnifiedResponse.out(UnifiedResponseCode.OK, trade);
    }

    @Override
    public UnifiedResponse<String> callback(String requestBody) {

        return UnifiedResponse.out(UnifiedResponseCode.OK, "");
    }
}
