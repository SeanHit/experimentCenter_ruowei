package com.sean.backend.dao.userModule;

import com.sean.backend.entity.userModule.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface AdminDao extends JpaRepository<Admin,String> {

    Optional<Admin> findById(String id);
}
