package com.sean.backend.service.userModuleService;

import com.sean.backend.dao.userModule.LeaderDao;
import com.sean.backend.entity.userModule.Leader;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LeaderService {
    @Resource
    private LeaderDao leaderDao;

    public List<Leader> grtAll(){
        return leaderDao.findAll();
    }
}
