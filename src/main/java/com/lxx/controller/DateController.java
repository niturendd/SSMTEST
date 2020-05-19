package com.lxx.controller;

import com.lxx.bean.Date;
import com.lxx.dao.DateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class DateController {
    @Autowired
    private DateMapper dateMapper;
    @RequestMapping("All")
    public String seleteAll(HttpServletRequest request, HttpServletResponse response){
        List<Date> dates = dateMapper.selectAll();
        request.setAttribute("dates",dates);
        return "result";
    }
    @RequestMapping("de")
    public String delete(Integer id, HttpServletRequest request,HttpServletResponse response){
        dateMapper.deleteByPrimaryKey(id);
        return seleteAll(request,response);
    }
    @RequestMapping("By")
    public String seleteId(String username, HttpServletRequest request, HttpServletResponse response){
        System.out.println("模糊");
        System.out.println("username:"+username);
         List<Date> dates = dateMapper.selectId(username);

         request.setAttribute("dates",dates);
        return "add";
    }

   @RequestMapping("to")
    public String toInsert(){
        return "insert";
    }

    @RequestMapping("add")
    public String insert(Date date, HttpServletRequest request,HttpServletResponse response){
        dateMapper.insert(date);
        return seleteAll(request,response);
    }
    @RequestMapping("toU")
    public String toUpdate(Integer id,String username,String password,HttpServletRequest request,HttpServletResponse response){
        request.setAttribute("id",id);
        request.setAttribute("username",username);
        request.setAttribute("password",password);
        return "update";
    }

    @RequestMapping("up")
    public String update(Date date,HttpServletRequest request,HttpServletResponse response){
        dateMapper.updateByPrimaryKey(date);
        return seleteAll(request,response);
    }
}
