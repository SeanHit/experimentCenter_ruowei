package com.sean.backend.controller;


import com.sean.backend.Result.Result;
import com.sean.backend.entity.userModule.*;
import com.sean.backend.service.userModuleService.AdminService;
import com.sean.backend.service.userModuleService.LeaderService;
import com.sean.backend.service.userModuleService.StudentService;
import com.sean.backend.service.userModuleService.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//
//@Controller
//@ResponseBody
//支持返回json格式，等价与上面的两个注解
@RestController
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
    public Result Find(@RequestParam String id,
                       @RequestParam String password) {
        String ID = id;
        String pas=password;
        List<Admin> admins = adminService.getAll();
        List<Teacher> teachers=teacherService.getAll();
        List<Leader> leaders=leaderService.grtAll();
        List<Student> students=studentService.getAll();
        //ObjectMapper mapper = new ObjectMapper();

        Result result=new Result();

        for (int i = 0; i < admins.size(); i++) {
            if (Objects.equals(admins.get(i).getAdminid(), id)){
                if(Objects.equals(admins.get(i).getPassword(), pas)){
                    result.setStatus(0);
//                    result.setData(admins.get(i));
//                    json = mapper.writeValueAsString(result);
                    result.setData(admins.get(i));
                    return result;
                }
            }
        }
        for (int i = 0; i < teachers.size(); i++) {
            if (Objects.equals(teachers.get(i).getTeacherid(), id))
                if(Objects.equals(teachers.get(i).getPassword(), pas)){
                    result.setStatus(0);
                    result.setData(teachers.get(i));
                    return  result;
                }

        }
        for (int i = 0; i < students.size(); i++) {
            if (Objects.equals(students.get(i).getStudentid(), id))
                if(Objects.equals(students.get(i).getPassword(), pas))
                {
                    result.setStatus(0);
                    result.setData(students.get(i));
                    return  result;
                }
        }
        for (int i = 0; i < leaders.size(); i++) {
            if (Objects.equals(leaders.get(i).getLeaderid(), id))
                if(Objects.equals(leaders.get(i).getPassword(), pas))
                {
                    result.setStatus(0);
                    result.setData(leaders.get(i));
                    return  result;
                }
        }
        result.setStatus(1);
        //json = mapper.writeValueAsString(result);
        return result;
    }

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String findone(@RequestParam String id) throws JsonProcessingException{
        String ID=id;
        ObjectMapper mapper=new ObjectMapper();
        //Optional<>类型的对象需要用.get()方法得到它里边的对象
        String json=mapper.writeValueAsString(adminService.findById(ID).get());
        return json;
    }
    @RequestMapping(value = "/test1",method = RequestMethod.POST)
    public List<Result> find() {

        List<Admin> admins=adminService.getAll();
        List<Result> results=new ArrayList<>();
        Result tempResule=new Result();
        for(int i=0;i<2;i++){
            tempResule.setStatus(0);
            tempResule.setData(admins.get(i));
            results.add(tempResule);
        }

        return results;
    }
}
