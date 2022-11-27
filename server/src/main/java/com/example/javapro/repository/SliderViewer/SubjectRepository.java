package com.example.javapro.repository.SliderViewer;

import com.example.javapro.model.CodeViewer.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.example.javapro.model.SliderViewer.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long>{
    List<Subject> findAllBy();
    Subject findByCategory(String category);
}