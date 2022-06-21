package org.com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class systemConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
//pro更新main
//远程仓库修改
//删除一项
