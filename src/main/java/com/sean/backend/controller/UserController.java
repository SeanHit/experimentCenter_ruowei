package com.sean.backend.controller;

import com.sean.backend.Result.MessageResult;
import com.sean.backend.dao.userModule.LeaderDao;
import com.sean.backend.dao.userModule.RoleDao;
import com.sean.backend.entity.userModule.*;
import com.sean.backend.service.userModuleService.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private AdminService adminService;
    @Resource
    private RoleService roleService;
    @Resource
    private LeaderService leaderService;
    @Resource
    private StudentService studentService;
    @Resource
    private TeacherService teacherService;
    @RequestMapping(value = "/addAdmin",method = RequestMethod.POST)
    public MessageResult addAdmin(@RequestParam String adminid,
                                  @RequestParam String extrainfo,
                                  @RequestParam String password,
                                  @RequestParam String name,
                                  @RequestParam String tel)throws Exception{
        MessageResult messageResult=new MessageResult();
        try{
            Admin admin=new Admin();
            admin.setAdminid(adminid);
            admin.setName(name);
            admin.setPassword(password);
            admin.setExtrainfo(extrainfo);
            admin.setTel(tel);
            admin.setJoinDate(new Date());
            admin.setType(3);
            Role role=roleService.findRoleByRoleid(3);//管理员角色id为3
            admin.setRole(role);
            adminService.save(admin);
            messageResult.setStatus(0);
            messageResult.setMessage("添加管理员成功！");
            return messageResult;
        }catch (Exception e){
            messageResult.setStatus(1);
            messageResult.setMessage(e.getMessage());
            return messageResult;
        }
    }
    @RequestMapping(value = "/addLeader",method = RequestMethod.POST)
    public MessageResult addLeader(@RequestParam String leaderid,
                                   @RequestParam String extrainfo,
                                   @RequestParam String password,
                                   @RequestParam String name,
                                   @RequestParam String tel)throws Exception{
        MessageResult messageResult=new MessageResult();
        try {
            Leader leader=new Leader();
            leader.setLeaderid(leaderid);
            leader.setExtrainfo(extrainfo);
            leader.setJoinDate(new Date());
            leader.setName(name);
            leader.setPassword(password);
            leader.setTel(tel);
            leader.setType(4);
            Role role=roleService.findRoleByRoleid(4);//领导角色id为4
            leader.setRole(role);
            leaderService.save(leader);
            messageResult.setStatus(0);
            messageResult.setMessage("添加管理员成功！");
            return messageResult;
        }catch (Exception e){
            messageResult.setStatus(1);
            messageResult.setMessage(e.getMessage());
            return messageResult;
        }
    }
    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public MessageResult addStudent(@RequestParam String studentid,
                                    @RequestParam String extrainfo,
                                    @RequestParam String password,
                                    @RequestParam String sName,
                                    @RequestParam String college,
                                    @RequestParam String major,
                                    @RequestParam String classNo)throws Exception{
        MessageResult messageResult=new MessageResult();
        try {
            Student student=new Student();
            student.setStudentid(studentid);
            student.setsName(sName);
            student.setPassword(password);
            student.setJoinDate(new Date());
            student.setCollege(college);
            student.setMajor(major);
            student.setClassNo(classNo);
            student.setExtrainfo(extrainfo);
            student.setType(1);
            Role role=roleService.findRoleByRoleid(1);
            student.setRole(role);
            studentService.save(student);
            messageResult.setStatus(0);
            messageResult.setMessage("添加管理员成功！");
            return messageResult;
        }catch (Exception e) {
            messageResult.setStatus(1);
            messageResult.setMessage(e.getMessage());
            return messageResult;
        }
    }
    @RequestMapping(value = "/addTeacher",method = RequestMethod.POST)
    public MessageResult addTeacher(@RequestParam String teacherid,
                                   @RequestParam String extrainfo,
                                   @RequestParam String password,
                                   @RequestParam String tName,
                                   @RequestParam String tel)throws Exception {
        MessageResult messageResult = new MessageResult();
        try{
            Teacher teacher=new Teacher();
            teacher.setTeacherid(teacherid);
            teacher.settName(tName);
            teacher.setPassword(password);
            teacher.setJoinDate(new Date());
            teacher.setTel(tel);
            teacher.setExtrainfo(extrainfo);
            teacher.setType(2);
            Role role=roleService.findRoleByRoleid(2);
            teacher.setRole(role);
            teacherService.save(teacher);
            messageResult.setStatus(0);
            messageResult.setMessage("添加管理员成功！");
            return messageResult;
        }catch (Exception e) {
            messageResult.setStatus(1);
            messageResult.setMessage(e.getMessage());
            return messageResult;
        }
    }
    @RequestMapping(value = "/deleteAdmin")
    public MessageResult deleteAdmin(@RequestParam String id)throws Exception{
        MessageResult messageResult=new MessageResult();
        try {
            adminService.deleteById(id);
            messageResult.setStatus(0);
            messageResult.setMessage("删除管理员成功!");
            return messageResult;
        }catch (Exception e){
            messageResult.setStatus(1);
            messageResult.setMessage(e.getMessage());
            return messageResult;
        }
    }
}
