package com.example.protalMine.controller;

import com.example.protalMine.entity.Persion;
import com.example.protalMine.service.Persionservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
* @Author:zhangxinlin
* @Description: spring boot test
* @Date:2017/5/18
*/
@RestController
public class BaseController {

    @Autowired
    Persionservice persionservice;

    @RequestMapping("/hellow")
    public String sayHellow(){
        return "hellow spring!";
    }

    @GetMapping("/persion/{id}")
    public Persion persion(@PathVariable Integer id){
        return persionservice.getPersion(id);
    }

    @GetMapping("/hellow2")
    public String sayHellow2(){
        return "hellow2 asdfsdf";
    }

    @GetMapping("/hellow3")
    public String syaHellow3(){
        return "hellow3adsfasd";
    }

//    @GetMapping("/person")

    @GetMapping("/person")
    public void savePerson(@RequestParam String name,@RequestParam Integer age){
        Persion p = new Persion();
        p.setName(name);
        p.setAge(age);
        p.setCreateTime(new Date());
        persionservice.save(p);
    }
}
