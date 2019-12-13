package com.sean.backend.dao.userModule;


import com.sean.backend.entity.userModule.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,String> {
}
