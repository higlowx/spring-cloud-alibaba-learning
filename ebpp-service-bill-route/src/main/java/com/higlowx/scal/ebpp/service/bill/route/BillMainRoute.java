package com.higlowx.scal.ebpp.service.bill.route;

import com.higlowx.scal.ebpp.common.consts.UriConsts;
import com.higlowx.scal.ebpp.common.res.UnifiedResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Dylan.Li
 * @date 2021/7/7
 * @since
 */
@RequestMapping(UriConsts.BILL_PREFIX + "/main")
public interface BillMainRoute {

    @GetMapping("/create")
    UnifiedResponse<Object> create(@RequestParam BigDecimal amount, @RequestParam Integer tradeId);

}
