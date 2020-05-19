package com.lxx.service;

import com.lxx.bean.Date;
import com.lxx.dao.DateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DateService implements DateMapper {
    @Autowired
    private  DateMapper dateMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Date record) {
        return 0;
    }

    @Override
    public Date selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<Date> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Date record) {
        return 0;
    }

    @Override
    public List<Date> selectId(String username) {
        return null;
    }
}
