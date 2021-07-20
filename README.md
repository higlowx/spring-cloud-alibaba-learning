# spring cloud alibaba learning
以支付场景为例，模拟全套微服务解决方案在此场景下的使用

## 代码结构
* ebpp-common 公共包，用于存储URI、常量、工具等
* ebpp-gateway 网关服务，使用spring cloud gateway完成统一鉴权、负载均衡等
* ebpp-nacos-server nacos服务，用作服务注册发现、服务管理、服务路由、配置中心等
* ebpp-sentinel-dashboard sentinel控制台服务
* ebpp-**-route 路径路由，用于各服务API接口的定义，携带URI、出入参等，便于其他服务引用，以及解决URI变化造成其他调用者无法获知导致调用失败的问题
* ebpp-service-trade 交易服务
* ebpp-service-bill 账单服务，与支付系统配合模拟强一致性分布式事务，使用seata，基于全局事务管理理论（即两阶段提交）
* ebpp-service-msg  消息服务，与支付系统配合模拟最终一致性分布式事务，使用消息中间件，基于可靠消息、最大努力通知理论

## 版本
**Spring Cloud Alibaba**：2.2.6.RC1

**Nacos**：1.4.2

**Sentinel**：1.8.1

**Seata**：1.3.0

**RocketMQ**：4.4.0

**Spring Boot**：2.3.2.RELEASE

**Spring Cloud**：Spring Cloud Hoxton.SR9

## 细节

### Nacos Client

#### 名词概念的理解

* **命名空间**：
  
    用于进行租户粒度的配置隔离。不同的命名空间下，可以存在相同的 Group 或 Data ID 的配置。Namespace 的常用场景之一是不同环境的配置的区分隔离，例如开发测试环境和生产环境的资源（如配置、服务）隔离等（摘自官方）。
* **服务分组**：
  
    不同的服务可以归类到同一分组。本人理解的是，可以用来定义同多种服务同属于一个项目集的标识。
  
### Sentinel

#### 一些思考
1. feign client在开启sentinel支持后，是怎样做到在消费侧处理服务提供者返回的sentinel异常的
   
    首先，如果服务提供方是被spring托管的话，一般都会有全局异常捕获处理逻辑，如果提供方绑定的sentinel规则被触发，继而抛出的BlockException异常为什么不会被全局异常机制捕获呢？
    这里，我认为sentinel的执行机制是容器级别（如tomcat）的，大概就是说sentinel是在容器层工作，高于spring，sentinel的限流等机制会在触达spring之前就被拦截掉了，所以对应的BlockException也不会被spring中设置的异常规则锁捕获。
    关于具体实现，可以通过后续读源码再细究。

2. 