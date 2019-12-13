package com.sean.backend.controller;


import com.sean.backend.Result.Result;
import com.sean.backend.entity.userModule.*;
import com.sean.backend.service.userModuleService.AdminService;
import com.sean.backend.service.userModuleService.LeaderService;
import com.sean.backend.service.userModuleService.StudentService;
import com.sean.backend.service.userModuleService.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@Controller
@ResponseBody
public class TestController {

    @Resource
    private AdminService adminService;
    @Resource
    private TeacherService teacherService;
    @Resource
    private StudentService studentService;
    @Resource
    private LeaderService leaderService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String Find(@RequestParam String id,
                       @RequestParam String password)throws JsonProcessingException {
        String ID = id;
        String pas=password;
        List<Admin> admins = adminService.getAll();
        List<Teacher> teachers=teacherService.getAll();
        List<Leader> leaders=leaderService.grtAll();
        List<Student> students=studentService.getAll();
        ObjectMapper mapper = new ObjectMapper();

        Result result=new Result();
        String json;
        for (int i = 0; i < admins.size(); i++) {
            if (Objects.equals(admins.get(i).getAdminid(), id)){
                if(Objects.equals(admins.get(i).getPassword(), pas)){
                    result.setStatus(0);
                    result.setData(admins.get(i));
                    json = mapper.writeValueAsString(result);
                    return json;
                }
            }
        }
        for (int i = 0; i < teachers.size(); i++) {
            if (Objects.equals(teachers.get(i).getTeacherid(), id))
                if(Objects.equals(teachers.get(i).getPassword(), pas)){
                    result.setStatus(0);
                    result.setData(teachers.get(i));
                    json = mapper.writeValueAsString(result);
                    return  json;
                }

        }
        for (int i = 0; i < students.size(); i++) {
            if (Objects.equals(students.get(i).getStudentid(), id))
                if(Objects.equals(students.get(i).getPassword(), pas))
                {
                    result.setStatus(0);
                    result.setData(students.get(i));
                    json = mapper.writeValueAsString(result);
                    return  json;
                }
        }
        for (int i = 0; i < leaders.size(); i++) {
            if (Objects.equals(leaders.get(i).getLeaderid(), id))
                if(Objects.equals(leaders.get(i).getPassword(), pas))
                {
                    result.setStatus(0);
                    result.setData(leaders.get(i));
                    json = mapper.writeValueAsString(result);
                    return  json;
                }
        }
        result.setStatus(1);
        json = mapper.writeValueAsString(result);
        return json;
    }
}
