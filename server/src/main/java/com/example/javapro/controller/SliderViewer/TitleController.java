package com.example.javapro.controller.SliderViewer;

import com.example.javapro.model.CodeViewer.CodeTitle;
import com.example.javapro.repository.SliderViewer.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.javapro.model.SliderViewer.Title;
import com.example.javapro.repository.SliderViewer.TitleRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("title")
public class TitleController {
    @Autowired
    private TitleRepository titleRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping("name")
    public List<Title> getTitle() {
        return this.titleRepository.findAllBy();
    }

    @GetMapping("/{category}")
    public List<Title> getListByCategory(@PathVariable("category") String category) {
        return this.titleRepository.findAllBySubject(this.subjectRepository.findByCategory(category));
    }

}