package com.myweb.controller;

import com.github.pagehelper.PageHelper;
import com.myweb.entity.PerInfo;
import com.myweb.service.PerInfoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Control {

    @Autowired
    PerInfoservice perInfoservice;

    @RequestMapping("/hello")
    public List<PerInfo> Hello() {
        List<PerInfo> list = perInfoservice.selectName();
        System.out.println(list);
        return list;
    }

    @RequestMapping("/ll")
    public int ll(@RequestParam(value = "name" ,required = false) String name) {
        PerInfo perInfo = new PerInfo();
        perInfo.setName(name);
        return perInfoservice.insertAll(perInfo);
    }

    @PostMapping("/hello2")
    public List<PerInfo> Hello2() {
        List<PerInfo> list = perInfoservice.selectName();
        System.out.println(list);
        return list;
    }

    @GetMapping("/hello3")
    public List<PerInfo> Hello3() {
        List<PerInfo> list = perInfoservice.selectName();
        System.out.println(list);
        return list;
    }
}
