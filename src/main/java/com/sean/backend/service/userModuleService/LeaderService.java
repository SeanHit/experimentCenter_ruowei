package com.sean.backend.service.userModuleService;

import com.sean.backend.dao.userModule.LeaderDao;
import com.sean.backend.entity.userModule.Admin;
import com.sean.backend.entity.userModule.Leader;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class LeaderService {
    @Resource
    private LeaderDao leaderDao;

    public List<Leader> grtAll(){
        return leaderDao.findAll();
    }
    public Boolean exist(String id, String password){
        return leaderDao.existsLeaderByLeaderidAndPassword(id, password);
    }
    public List<Optional<Leader>> findByLeaderidAndPassword(String id,String password){
        return leaderDao.findByLeaderidAndPassword(id, password);
    }
    public Leader findLeaderByLeaderAndPassword(String id,String password){
        return leaderDao.findLeaderByLeaderidAndPassword(id, password);
    }
    public Leader save(Leader leader){
        return leaderDao.save(leader);
    }
    public void deleteById(String id){
        leaderDao.deleteById(id);
    }
}
