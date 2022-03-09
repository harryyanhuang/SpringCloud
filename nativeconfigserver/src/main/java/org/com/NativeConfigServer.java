package org.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer  //声明配置中心
public class NativeConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServer.class,args);
    }
}
