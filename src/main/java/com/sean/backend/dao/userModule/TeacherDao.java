package com.sean.backend.dao.userModule;

import com.sean.backend.entity.userModule.Admin;
import com.sean.backend.entity.userModule.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherDao extends JpaRepository<Teacher,String> {
}
