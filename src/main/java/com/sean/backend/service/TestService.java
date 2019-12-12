package com.sean.backend.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sean.backend.dao.TestDao;
import com.sean.backend.entity.courseModule.seleCourse;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

public class TestService {
    @Resource
    private TestDao testDao;


    public String StudentFindOne()  {


        return testDao.findById(1).toString();
    }
}
