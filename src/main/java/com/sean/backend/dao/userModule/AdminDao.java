package com.sean.backend.dao.userModule;

import com.sean.backend.entity.userModule.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface AdminDao extends JpaRepository<Admin,String> {

    Optional<Admin> findById(String id);
    Admin findAdminByAdminid(String id);
    Admin findAdminByAdminidAndPassword(String id, String password);
    List<Optional<Admin>> findByAdminidAndPassword(String id, String password);
    boolean existsAdminByAdminidAndPassword(String id, String password);

}
