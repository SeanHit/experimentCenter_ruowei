package com.sean.backend.service.userModuleService;


import com.sean.backend.Result.Result;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class LoginService {
    @Resource
    private AdminService adminService;
    @Resource
    private LeaderService leaderService;
    @Resource
    private StudentService studentService;
    @Resource
    private TeacherService teacherService;

    public Result loginVerify(String id,String password){


        Result result=new Result();
        if(adminService.exist(id, password)){
            result.setStatus(0);
            result.setData(adminService.findAdminByAdminidAndPassword(id, password));
            return result;
        }
        else if(teacherService.exist(id, password)){
            result.setStatus(0);
            result.setData(teacherService.findTeacherByTeacheridAndPassword(id, password));
            return result;
        }
        else if(studentService.exist(id, password)){
            result.setStatus(0);
            result.setData(studentService.findStudentByStudentidAndPassword(id, password));
            return result;
        }
        else if(leaderService.exist(id, password)){
            result.setStatus(0);
            result.setData(leaderService.findLeaderByLeaderAndPassword(id, password));
            return result;
        }
        else {
            result.setStatus(1);
            return result;
        }
    }
}
