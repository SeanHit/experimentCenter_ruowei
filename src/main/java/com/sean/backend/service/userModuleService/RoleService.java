package com.sean.backend.service.userModuleService;

import com.sean.backend.dao.userModule.RoleDao;
import com.sean.backend.entity.userModule.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleService {

    @Resource
    private RoleDao roleDao;
    public Role findRoleByRoleid(int id){
        return roleDao.findRoleByRoleid(id);
    }
}
