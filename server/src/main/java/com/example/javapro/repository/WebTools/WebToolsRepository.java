package com.example.javapro.repository.WebTools;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.example.javapro.model.WebTools.WebTools;

@Repository
public interface WebToolsRepository  extends JpaRepository<WebTools, Long>{
    List<WebTools> findAllBy();
}