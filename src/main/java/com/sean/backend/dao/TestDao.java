package com.sean.backend.dao;

import com.sean.backend.entity.userModule.Role;
import com.sean.backend.entity.userModule.RolePriv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestDao extends JpaRepository<RolePriv,Integer> {
    RolePriv findById(int a);
}
