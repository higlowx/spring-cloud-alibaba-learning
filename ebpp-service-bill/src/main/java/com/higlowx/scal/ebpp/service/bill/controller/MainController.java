package com.higlowx.scal.ebpp.service.bill.controller;

import com.alibaba.fastjson.JSON;
import com.higlowx.scal.ebpp.common.res.UnifiedResponse;
import com.higlowx.scal.ebpp.common.res.UnifiedResponseCode;
import com.higlowx.scal.ebpp.service.bill.entity.Bill;
import com.higlowx.scal.ebpp.service.bill.route.BillMainRoute;
import com.higlowx.scal.ebpp.service.bill.service.BillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author Dylan.Li
 * @date 2021/7/8
 * @since
 */
@RestController
public class MainController implements BillMainRoute {

    private static final Logger LOG = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private BillService billService;

    @Override
    public UnifiedResponse<Object> create(BigDecimal amount, Integer tradeId) {
        Bill bill = billService.create(amount, tradeId);
        UnifiedResponse<Object> out = UnifiedResponse.out(UnifiedResponseCode.OK, bill);
        LOG.info("out: {}", JSON.toJSONString(out));
        return out;
    }
}
