package com.sean.backend.controller;


import com.sean.backend.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@ResponseBody
public class TestController {

    @Autowired
    private TestDao testDao;


    @RequestMapping(value = "/test")
    public String StudentFindOne() throws JsonProcessingException{

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(testDao.findById(1));
        System.out.println(mapper.writeValueAsString(testDao.findById(1)));
        return json;
    }
}