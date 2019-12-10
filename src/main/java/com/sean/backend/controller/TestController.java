package com.sean.backend.controller;


import com.sean.backend.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

    @Autowired
    private TestDao testDao;


    @RequestMapping(value = "/test")
    public String StudentFindOne(){

        return testDao.findById(1).getStudent().getsName().toString();
    }
}
