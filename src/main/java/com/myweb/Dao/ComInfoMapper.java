package com.myweb.Dao;

import com.myweb.entity.ComInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ComInfoMapper {

    List<ComInfo> selectall();
    ComInfo selectOne(int id);
    int insertall(ComInfo comInfo);
    int updateall(ComInfo comInfo);
    int deleteall(ComInfo comInfo);
}
