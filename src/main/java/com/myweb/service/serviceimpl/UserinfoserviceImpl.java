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
        int result = userinfoMapper.userLogin(userName,password);
        if (result == 1){
            return "登录成功";
        }else {
            return "登录失败";
        }
    }

    @Override
    public String userLogin() {
        return null;
    }
}
