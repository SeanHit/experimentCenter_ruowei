package com.sean.backend.service.userModuleService;

import com.sean.backend.dao.userModule.AdminDao;
import com.sean.backend.entity.userModule.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    @Resource
    private AdminDao adminDao;

    //@Transactional
    public List<Admin> getAll(){
       return adminDao.findAll();
    }

    public Admin findById(String id){
        return adminDao.findAdminByAdminid(id);
    }

    public Boolean exist(String id,String password){
        return adminDao.existsAdminByAdminidAndPassword(id, password);
    }

    public List<Optional<Admin>> findByAdminidAndPassword(String id,String password){
        return adminDao.findByAdminidAndPassword(id,password);
    }

    public Admin save(Admin admin){
        return adminDao.save(admin);
    }
    public Admin findAdminByAdminidAndPassword(String id,String password){
        return adminDao.findAdminByAdminidAndPassword(id, password);
    }
    public void deleteById(String id){
        adminDao.deleteById(id);
    }
}
