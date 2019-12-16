package com.sean.backend.service.userModuleService;

import com.sean.backend.dao.userModule.TeacherDao;
import com.sean.backend.entity.userModule.Teacher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherService {
    @Resource
    private TeacherDao teacherDao;

    public List<Teacher> getAll(){
        return teacherDao.findAll();
    }

}
