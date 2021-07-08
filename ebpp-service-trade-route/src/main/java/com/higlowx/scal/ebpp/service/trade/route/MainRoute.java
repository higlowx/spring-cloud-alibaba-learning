package com.higlowx.scal.ebpp.service.trade.route;

import com.higlowx.scal.ebpp.common.consts.UriConsts;
import com.higlowx.scal.ebpp.common.res.EbppResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dylan.Li
 * @date 2021/7/7
 * @since
 */
@RequestMapping(UriConsts.TRADE_PREFIX + "/main")
public interface MainRoute {

    @PostMapping("/callback")
    EbppResponse<String> callback(@RequestBody String requestBody);
}
