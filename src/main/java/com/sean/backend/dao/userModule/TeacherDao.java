package com.sean.backend.dao.userModule;

import com.sean.backend.entity.userModule.Admin;
import com.sean.backend.entity.userModule.Student;
import com.sean.backend.entity.userModule.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TeacherDao extends JpaRepository<Teacher,String> {
    List<Optional<Teacher>> findByTeacheridAndPassword(String id, String password);
    Boolean existsTeacherByTeacheridAndPassword(String id,String password);
    Teacher findTeacherByTeacheridAndPassword(String id,String password);
}
