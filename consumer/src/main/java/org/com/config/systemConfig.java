package org.com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class systemConfig {
//再次更改，即第三次更改
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
