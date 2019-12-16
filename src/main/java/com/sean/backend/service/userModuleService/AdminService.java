package com.sean.backend.service.userModuleService;

import com.sean.backend.dao.userModule.AdminDao;
import com.sean.backend.entity.userModule.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

   public Optional<Admin> findById(String id){
        return adminDao.findById(id);
   }
}
