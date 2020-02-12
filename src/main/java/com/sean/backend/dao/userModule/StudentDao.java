package com.sean.backend.dao.userModule;


import com.sean.backend.entity.userModule.Admin;
import com.sean.backend.entity.userModule.Leader;
import com.sean.backend.entity.userModule.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentDao extends JpaRepository<Student,String> {
    List<Optional<Student>> findByStudentidAndPassword(String id, String password);
    Boolean existsStudentByStudentidAndPassword(String id,String password);
    Student findStudentByStudentidAndPassword(String id,String password);
}
