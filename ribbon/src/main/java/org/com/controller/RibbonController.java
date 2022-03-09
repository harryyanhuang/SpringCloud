package org.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/index")
    public String index(){
      return   restTemplate.getForObject("http://provider/student/index",String.class);
    }
}
