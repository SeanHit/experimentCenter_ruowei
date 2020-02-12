package com.sean.backend.dao.userModule;


import com.sean.backend.entity.userModule.Admin;
import com.sean.backend.entity.userModule.Leader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LeaderDao extends JpaRepository<Leader,String> {
    List<Optional<Leader>> findByLeaderidAndPassword(String id, String password);
    boolean existsLeaderByLeaderidAndPassword(String id, String password);
    Leader findLeaderByLeaderidAndPassword(String id, String password);
}
