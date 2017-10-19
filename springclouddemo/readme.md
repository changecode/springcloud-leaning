服务的注册与发现（Eureka）
服务消费者（rest+ribbon）
服务消费者（Feign）
断路器（Hystrix）
路由网关(zuul)


在Spring Cloud可以用RestTemplate+Ribbon和Feign来调用
===

ribbon负载均衡说明
===
1、一个服务注册中心，eureka server,端口为3333

2、CLIENT-TEST工程跑了两个实例，端口分别为3335,3336
分别向服务注册中心注册

3、sercvice-ribbon端口为8764,向服务注册中心注册

4、ribbon-service通过restTemplate调用CLIENT-TEST的
hello接口时，因为用ribbon进行了负载均衡，
会轮流的调用CLIENT-TEST：3335和3336两个端口的hello接口



Feign
===

Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。
使用Feign，只需要创建一个接口并注解。它具有可插拔的注解特性，
可使用Feign 注解和JAX-RS注解。Feign支持可插拔的编码器和解码器。
Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果

Feign:采用的是基于接口的注解
Feign:整合了ribbon

config-server 配置中心服务端(将不同的环境的配置参数放置于仓库中比如git)
config-client 配置中心客户端

