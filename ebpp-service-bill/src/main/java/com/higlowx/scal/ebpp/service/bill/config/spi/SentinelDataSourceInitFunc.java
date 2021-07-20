package com.higlowx.scal.ebpp.service.bill.config.spi;

import com.alibaba.csp.sentinel.datasource.Converter;
import com.alibaba.csp.sentinel.datasource.ReadableDataSource;
import com.alibaba.csp.sentinel.datasource.nacos.NacosDataSource;
import com.alibaba.csp.sentinel.init.InitFunc;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Dylan.Li
 * @date 2021/7/20
 * @since
 */

public class SentinelDataSourceInitFunc implements InitFunc {

//    public static final ResourceBundle R = ResourceBundle.getBundle("application.properties", Locale.CHINA);
//    private static final String SERVER_ADDR = R.getString("spring.cloud.sentinel.datasource.flow.nacos.server-addr");
//    private static final String GROUP_ID = R.getString("spring.cloud.sentinel.datasource.flow.nacos.group-id");
//    private static final String DATA_ID = R.getString("spring.cloud.sentinel.datasource.flow.nacos.data-id");

    private static final String SERVER_ADDR = "localhost:8488";
    private static final String GROUP_ID = "DEFAULT_GROUP";
    private static final String DATA_ID = "com.higlowx.scal.ebpp.service.bill.sebtinel";


    @Override
    public void init() throws Exception {
        //以下暂时仅对flow类型（流量控制）的init进行演示
        //FlowRule flowRule = new FlowRule();
        //理论上resource的配置可以采用扫描出资源，并进行规模化或特例化配置
        //flowRule.setResource("/bill/main/create");
        //flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        //count值理论上可以根据每台机器的特性计算得出，这样更加合理
        //flowRule.setCount(5);
        //flowRule.setStrategy(RuleConstant.STRATEGY_DIRECT);
        //flowRule.setLimitApp(RuleConstant.LIMIT_APP_DEFAULT);
        //flowRule.setControlBehavior(RuleConstant.CONTROL_BEHAVIOR_DEFAULT);
        //flowRule.setClusterMode(false);

        //List<FlowRule> flowRules = new ArrayList<>();
        //flowRules.add(flowRule);

        //JSONObject source = new JSONObject();
        //source.put("flow", flowRules);


        ReadableDataSource<String, List<FlowRule>> flowRuleDataSource = new NacosDataSource<List<FlowRule>>(SERVER_ADDR, GROUP_ID, DATA_ID,
                new Converter<String, List<FlowRule>>() {
                    @Override
                    public List<FlowRule> convert(String source) {
                        return JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
                        });
                    }
                });

        FlowRuleManager.register2Property(flowRuleDataSource.getProperty());
    }
}
