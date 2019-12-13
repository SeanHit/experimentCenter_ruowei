package com.sean.backend.dao.userModule;

import com.sean.backend.entity.userModule.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
import java.util.Optional;


public interface AdminDao extends JpaRepository<Admin,String> {
    //Admin findById(String id);
}
