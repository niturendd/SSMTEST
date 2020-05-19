package com.lxx.service;

import com.lxx.bean.Date;
import com.lxx.bean.Goods;
import com.lxx.dao.DateMapper;
import com.lxx.dao.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService implements GoodsMapper {

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public List<Date> selectAll() {
        return null;
    }
}
