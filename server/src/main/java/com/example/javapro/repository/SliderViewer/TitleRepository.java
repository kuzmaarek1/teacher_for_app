package com.example.javapro.repository.SliderViewer;

import com.example.javapro.model.CodeViewer.CodeTitle;
import com.example.javapro.model.CodeViewer.Language;
import com.example.javapro.model.SliderViewer.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.example.javapro.model.SliderViewer.Title;

@Repository
public interface TitleRepository extends JpaRepository<Title, Long>{
    List<Title> findAllBy();
    List<Title> findAllBySubject(Subject subject);
    Title findByCategory(String category);
}