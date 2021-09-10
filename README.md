# 🔥 spring cloud alibaba learning
以支付场景为例，模拟全套微服务解决方案在此场景下的使用，详细介绍在[这里](https://higlowx.com/blog/spring-cloud-alibaba-wei-fu-wu-jie-jue-fang-an-ru-he-luo-di-chu-tan) 。

## 🎨 主要功能

- **流控与服务降级（Flow Control and service degradation）**：默认支持 WebServlet、WebFlux, OpenFeign、RestTemplate、Spring Cloud Gateway, Zuul, Dubbo 和 RocketMQ 限流降级功能的接入，可以在运行时通过控制台实时修改限流降级规则，还支持查看限流降级 Metrics 监控。
- **服务注册与发现（Service registration and discovery）**：适配 Spring Cloud 服务注册与发现标准，默认集成了 Ribbon 负载均衡的支持。
- **分布式配置管理（Distributed configuration）**：支持分布式系统中的外部化配置，配置更改时自动刷新。
- **事件驱动（Event-driven）**：基于分布式消息实现构建高性能事件驱动的微服务体系。
- **分布式事务（Distributed Transaction）**：高效并且对业务零侵入地解决分布式事务问题。
- **微服务网关（Microservices Gateway）**：为整套内部微服务链路提供一个可靠且高性能的对外网关，并配套流控、路由、鉴权等能力。
- **服务间远程过程调用（Remote Procedure Call）**：提供可靠方便的RPC框架，实现各个系统间就像在调用本地程序一样地调用远程服务。

## 📌 组件版本

| 组件 | 版本 | 功能 |
| ------ |------|------|
| Spring Cloud Alibaba | 2.2.6.RC1 | 以pom方式接入，用于各类client中的依赖引入和版本控制 |
| Nacos server | 1.4.2 | 服务注册发现与分布式配置中心 |
| Sentinel dashboard | 1.8.1 | 流控、降级与流量指标监控控制台 |
| Seata server | 1.3.0 | 分布式事务TC |
| Spring Cloud Community | Spring Cloud Hoxton.SR9 | 以pom方式接入，用于各类社区版组件client中的依赖引入和版本控制 |
| Spring Cloud Gateway Server | 2.2.6.RELEASE | 微服务网关 |
| Spring Cloud OpenFeign | 2.2.6.RELEASE | RPC调用组件，未使用官方推荐的Dubbo |

## 👉 代码结构

- **ebpp-common**： 公共包，用于存储URI、常量、工具等。
- **ebpp-gateway** ：网关服务，使用 Spring Cloud Gateway 完成统一鉴权、负载均衡等。
- **ebpp-nacos-server**： Nacos服务，用作服务注册发现、服务管理、服务路由、配置中心等。
- **ebpp-sentinel-dashboard**： Sentinel 控制台服务。
- **ebpp-seata-server**：Seata TC 服务，进行分布式事务协调。
- **ebpp-xxx-route**： 路径路由，用于各服务API接口的定义，携带URI、出入参等，便于其他服务引用，以及解决URI变化造成其他调用者无法获知导致调用失败的问题。
- **ebpp-service-trade**： 交易服务。
- **ebpp-service-bil**l： 账单服务，与支付系统配合模拟强一致性分布式事务，使用seata，基于全局事务管理理论（两阶段提交）变种出的AT模式。