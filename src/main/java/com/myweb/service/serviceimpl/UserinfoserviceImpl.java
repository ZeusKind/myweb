package com.myweb.service.serviceimpl;

import com.myweb.Dao.UserinfoMapper;
import com.myweb.entity.Userinfo;
import com.myweb.service.Userinfoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserinfoserviceImpl implements Userinfoservice {

    @Autowired
    UserinfoMapper userinfoMapper;

    @Override
    public String userLogin(Userinfo userinfo) {
        String userName = userinfo.getUserName();
        String password = userinfo.getPassword();

        if(userName == null || userName == ""){
            return "用户名为空，请重新输入";
        }else if(password == null || password == "") {
            return "密码为空，请重新输入";
        }

        if (userinfoMapper.checkUserNameExist(userName) == 0){
            return "没有该用户,请检查用户名是否输入错误";
        }
        int result = userinfoMapper.userLogin(userName,password);

        if (result == 1){
            return "登录成功（已跳转）";
        }else {
            return "密码错误，请重试";
        }
    }

}
