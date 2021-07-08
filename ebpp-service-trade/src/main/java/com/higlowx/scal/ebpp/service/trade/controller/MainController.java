package com.higlowx.scal.ebpp.service.trade.controller;

import com.higlowx.scal.ebpp.common.res.EbppResponse;
import com.higlowx.scal.ebpp.common.res.EbppResponseCode;
import com.higlowx.scal.ebpp.service.trade.route.MainRoute;
import com.higlowx.scal.ebpp.service.trade.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dylan.Li
 * @date 2021/7/8
 */
@RestController
public class MainController implements MainRoute {

    @Autowired
    private TradeService tradeService;

    @Override
    public EbppResponse<String> callback(String requestBody) {

        return EbppResponse.out(EbppResponseCode.OK, "");
    }
}
