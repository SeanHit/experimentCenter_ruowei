package com.sean.backend.dao.userModule;


import com.sean.backend.entity.userModule.Leader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaderDao extends JpaRepository<Leader,String> {
}
