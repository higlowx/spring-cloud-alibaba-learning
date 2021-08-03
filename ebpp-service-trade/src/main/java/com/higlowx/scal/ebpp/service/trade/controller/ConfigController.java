package com.higlowx.scal.ebpp.service.trade.controller;

import com.higlowx.scal.ebpp.common.consts.UriConsts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dylan.Li
 * @date 2021/8/3
 * @since
 */
@RestController
@RequestMapping(UriConsts.TRADE_PREFIX + "/config")
@RefreshScope
public class ConfigController {

    @Value("${config.test}")
    private String test;

    @GetMapping("/test")
    public String test() {
        return test;
    }
}
