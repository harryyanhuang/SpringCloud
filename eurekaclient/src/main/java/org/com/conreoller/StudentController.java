package org.com.conreoller;

import org.com.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return Arrays.asList(new Student(1,"张三",23),
                new Student(2,"李四",25),
                new Student(3,"王五",21)
                );
    }

    @PostMapping("/add")
    public int add(@RequestBody Student student){
        System.out.println(student);
        return 1;
    }

    @DeleteMapping("/delete/{id}")
    public int delete(@PathVariable("id") int id){
        System.out.println(id);
        return 1;           //测试修改第一处
    }

    @PutMapping("/update")
    public int update(@RequestBody Student student){
        System.out.println(student);
        return 1;
    }

    @GetMapping("/index")
    public String index(){
        return "当前端口："+this.port;
    }

}
