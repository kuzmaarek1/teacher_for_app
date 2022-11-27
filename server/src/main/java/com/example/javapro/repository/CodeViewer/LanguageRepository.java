package com.example.javapro.repository.CodeViewer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.example.javapro.model.CodeViewer.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long>{
    List<Language> findAllBy();
    Language findByCategory(String category);
}