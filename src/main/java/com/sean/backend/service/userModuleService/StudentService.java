package com.sean.backend.service.userModuleService;

import com.sean.backend.dao.userModule.StudentDao;
import com.sean.backend.entity.userModule.Admin;
import com.sean.backend.entity.userModule.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Resource
    private StudentDao studentDao;

    public List<Student> getAll(){

        return studentDao.findAll();
    }
    public Boolean exist(String id, String password){
        return studentDao.existsStudentByStudentidAndPassword(id, password);
    }
    public List<Optional<Student>> findByStudentidAndPassword(String id,String password){
        return studentDao.findByStudentidAndPassword(id,password);
    }
    public Student save(Student student){
        return studentDao.save(student);
    }
    public Student findStudentByStudentidAndPassword(String id,String password){
        return studentDao.findStudentByStudentidAndPassword(id, password);
    }
    public void deleteById(String id){
        studentDao.deleteById(id);
    }
}
