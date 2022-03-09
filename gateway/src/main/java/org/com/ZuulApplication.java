package org.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//设置该类是网关启动类
@EnableZuulProxy
//自动装置配置文件
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
//        启动注册中心 ——>启动服务提供者 ——> 启动网关 ——>
//        可以负载均衡，轮询
    }
}
