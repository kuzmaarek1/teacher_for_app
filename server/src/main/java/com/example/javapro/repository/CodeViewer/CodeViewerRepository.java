package com.example.javapro.repository.CodeViewer;

import com.example.javapro.model.CodeViewer.CodeTitle;
import com.example.javapro.model.CodeViewer.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.example.javapro.model.CodeViewer.CodeViewer;

@Repository
public interface CodeViewerRepository extends JpaRepository<CodeViewer, Long>{
    List<CodeViewer> findAllBy();
    List<CodeViewer> findAllByCodeTitle(CodeTitle codeTitle);
}