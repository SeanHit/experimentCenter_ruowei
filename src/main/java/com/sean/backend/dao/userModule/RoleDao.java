package com.sean.backend.dao.userModule;

import com.sean.backend.entity.userModule.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role,Integer> {
    Role findRoleByRoleid(int id);
}
