package com.example.javapro.controller.SliderViewer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.javapro.repository.SliderViewer.SubjectRepository;
import com.example.javapro.model.SliderViewer.Subject;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("subject")
public class SubjectController {
    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping("name")
    public List<Subject> getSubject() {
        return this.subjectRepository.findAllBy();
    }
}