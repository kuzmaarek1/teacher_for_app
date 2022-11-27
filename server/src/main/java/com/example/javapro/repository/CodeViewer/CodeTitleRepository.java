package com.example.javapro.repository.CodeViewer;

import com.example.javapro.model.CodeViewer.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.javapro.model.CodeViewer.CodeTitle;

@Repository
public interface CodeTitleRepository extends JpaRepository<CodeTitle, Long>{
    List<CodeTitle> findAllBy();
    List<CodeTitle> findAllByLanguage(Language language);
    CodeTitle findByCategory(String category);
   // List<CodeTitle> findAllById(Long id);
}