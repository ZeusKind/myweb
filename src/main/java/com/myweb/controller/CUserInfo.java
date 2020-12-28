package com.myweb.controller;

import com.myweb.common.RequestData;
import com.myweb.common.ResponseData;
import com.myweb.common.utils.TokenUtils;
import com.myweb.common.utils.WebBeanCreator;
import com.myweb.entity.Userinfo;
import com.myweb.service.Userinfoservice;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CUserInfo {
    private static final Logger logger = LoggerFactory.getLogger(CUserInfo.class);
    //        logger.info("123");
    //        logger.error("456");
    //        logger.warn("789");
    @Autowired
    Userinfoservice userinfoservice;

    @RequestMapping("/login")
    public ResponseData userLogin(@RequestBody RequestData param){
        Userinfo userinfo = (Userinfo) WebBeanCreator.create(Userinfo.class, param.getData());

        String str = userinfo.getUserName()+"_"+userinfo.getPassword();
        // 获取token
        String token = TokenUtils.getToken(str);
        System.out.println("token Result: " + token);


        return ResponseData.ok(userinfoservice.userLogin(userinfo));
    }

    @RequestMapping("/login2")
    public ResponseData userLogin(@RequestParam(value = "userName")String userName, @RequestParam(value = "password")String password){
        Userinfo userinfo = new Userinfo();
        userinfo.setUserName(userName);
        userinfo.setPassword(password);
        return ResponseData.ok(userinfoservice.userLogin(userinfo));
    }
}
