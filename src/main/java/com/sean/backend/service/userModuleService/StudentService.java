package com.sean.backend.service.userModuleService;

import com.sean.backend.dao.userModule.StudentDao;
import com.sean.backend.entity.userModule.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService {
    @Resource
    private StudentDao studentDao;

    public List<Student> getAll(){
        return studentDao.findAll();
    }
}
