package com.myweb.service.serviceimpl;

import com.github.pagehelper.PageHelper;
import com.myweb.Dao.ComInfoMapper;
import com.myweb.entity.ComInfo;
import com.myweb.service.ComInfoservice;
import jdk.nashorn.internal.ir.LiteralNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ComInfoImpl implements ComInfoservice {

    @Autowired
    ComInfoMapper comInfoMapper;

    @Override
    public List<ComInfo> selectall() {
        return comInfoMapper.selectall();
    }

    @Override
    public int insertall(ComInfo comInfo) {
        comInfo.setComment_time(new Date());
        return comInfoMapper.insertall(comInfo);
    }

    @Override
    public int updateall(ComInfo comInfo) {

        return comInfoMapper.updateall(comInfo);
    }

    @Override
    public int deleteall(ComInfo comInfo) {

        return comInfoMapper.deleteall(comInfo);
    }



}
