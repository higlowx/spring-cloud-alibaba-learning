package com.higlowx.scal.ebpp.service.trade.rpc;

import com.higlowx.scal.ebpp.common.res.UnifiedResponse;
import com.higlowx.scal.ebpp.common.res.UnifiedResponseCode;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 *
 * 本实例必须被spring管理！！
 *
 * @author Dylan.Li
 * @date 2021/7/20
 * @since
 */
@Component
public class BillClientFallbackFactory implements FallbackFactory<BillClient> {

    private static final Logger log = LoggerFactory.getLogger(BillClientFallbackFactory.class);

    @Override
    public BillClient create(Throwable throwable) {
        log.warn("bill服务触发sentinel的熔断限流机制，trade侧调用fallback逻辑兼容rpc故障", throwable);
        return new BillClient() {
            @Override
            public UnifiedResponse<Object> create(BigDecimal amount, Integer tradeId) {
                return UnifiedResponse.out(UnifiedResponseCode.UNIFIED_FAIL, "bill接口被限流、熔断或降级");
            }
        };
    }
}
