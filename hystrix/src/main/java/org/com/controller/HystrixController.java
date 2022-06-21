package org.com.controller;

import org.com.entity.Student;
import org.com.feign.FeignProviderClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class HystrixController {

    @Resource
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        Collection<Student> all = feignProviderClient.findAll();
        return all;     //测试修改第二处
    }
//暂时不提交
    @GetMapping("/index")
    public String index(){
    return    feignProviderClient.index();
    }
}
