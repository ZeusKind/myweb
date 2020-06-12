package com.myweb.controller;

import com.myweb.entity.PerInfo;
import com.myweb.service.PerInfoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CPerInfo {

    @Autowired
    PerInfoservice perInfoservice;

    @RequestMapping("/selectName")
    public List<PerInfo> selectName() {
        List<PerInfo> list = perInfoservice.selectName();
        System.out.println(list);
        return list;
    }


    @RequestMapping("/insert")
    public int insert(@RequestParam(value = "name" ,required = false) String name) {
        PerInfo perInfo = new PerInfo();
        perInfo.setName(name);
        return perInfoservice.insertAll(perInfo);
    }

}
