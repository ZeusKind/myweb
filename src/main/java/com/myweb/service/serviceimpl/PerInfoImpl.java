package com.myweb.service.serviceimpl;

import com.github.pagehelper.PageHelper;
import com.myweb.Dao.PerInfoMapper;
import com.myweb.entity.PerInfo;
import com.myweb.service.PerInfoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PerInfoImpl implements PerInfoservice {

    @Autowired
    PerInfoMapper perInfoMapper;


    @Override
    public List<PerInfo> selectName() {
        PageHelper.startPage(5,2);
        return perInfoMapper.selectName();
    }

    @Override
    public int insertAll(PerInfo perInfo) {
        return perInfoMapper.insertAll(perInfo);
    }

}
