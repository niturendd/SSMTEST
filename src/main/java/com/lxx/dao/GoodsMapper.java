package com.lxx.dao;

import com.lxx.bean.Date;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

//    int insert(Date record);
//
//    Date selectByPrimaryKey(Integer id);
//
    List<Date> selectAll();
//
//    int updateByPrimaryKey(Date record);
//
//    List<Date> selectId(@Param("username") String username);
}