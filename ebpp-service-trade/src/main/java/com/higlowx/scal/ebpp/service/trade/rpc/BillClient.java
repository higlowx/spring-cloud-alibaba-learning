package com.higlowx.scal.ebpp.service.trade.rpc;

import com.higlowx.scal.ebpp.service.bill.route.BillMainRoute;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Dylan.Li
 * @date 2021/7/12
 * @since
 */
@FeignClient(name = "ebpp-service-bill")
public interface BillClient extends BillMainRoute {
}
