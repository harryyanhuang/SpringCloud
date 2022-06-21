package org.com.Controller;

import org.com.entity.Student;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Collection;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
    }

    @GetMapping("/findAll1")
    public Collection<Student> findAll1(){
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }

    @PostMapping("/add")
    public int add(Student student){
        System.out.println(student);
        return restTemplate.postForObject("http://localhost:8010/student/add",student,int.class);
    }

    @PostMapping("/add1")
    public int add1( Student student){
        System.out.println(student);
        return restTemplate.postForObject("http://localhost:8010/student/add",student,int.class);
    }

    @DeleteMapping("/delete/{id}") //第二个文件更改
    public void delete(@PathVariable("id") int id){
        System.out.println("删除"+id);
        restTemplate.delete("http://localhost:8010/student/delete/{id}",id);
    }

    @DeleteMapping("/delete1/{id}")
    public void delete1(@PathVariable("id") int id){
        System.out.println("删除"+id);
        restTemplate.delete("http://localhost:8010/student/delete/{id}",id);
    }

    @PutMapping("/update")
    public void update(Student student){
        restTemplate.put("http://localhost:8010/student/update",student);
    }
}
