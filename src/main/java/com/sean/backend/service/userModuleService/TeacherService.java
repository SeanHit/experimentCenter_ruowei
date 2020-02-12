package com.sean.backend.service.userModuleService;

import com.sean.backend.dao.userModule.TeacherDao;
import com.sean.backend.entity.userModule.Admin;
import com.sean.backend.entity.userModule.Teacher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Resource
    private TeacherDao teacherDao;

    public List<Teacher> getAll(){

        return teacherDao.findAll();
    }
    public Boolean exist(String id, String password){
        return teacherDao.existsTeacherByTeacheridAndPassword(id, password);
    }
    public List<Optional<Teacher>> findByTeacheridAndPassword(String id,String password){
        return teacherDao.findByTeacheridAndPassword(id,password);
    }
    public Teacher findTeacherByTeacheridAndPassword(String id,String password){
        return teacherDao.findTeacherByTeacheridAndPassword(id, password);
    }
    public Teacher save(Teacher teacher){
        return teacherDao.save(teacher);
    }
    public void deleteById(String id){
        teacherDao.deleteById(id);
    }
}
