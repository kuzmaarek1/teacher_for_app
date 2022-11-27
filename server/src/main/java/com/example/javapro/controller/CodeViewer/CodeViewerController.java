package com.example.javapro.controller.CodeViewer;

import com.example.javapro.repository.CodeViewer.CodeTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.javapro.model.CodeViewer.CodeViewer;
import com.example.javapro.repository.CodeViewer.CodeViewerRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("code/")
public class CodeViewerController {
    @Autowired
    private CodeViewerRepository codeViewerRepository;

    @Autowired
    private CodeTitleRepository codeTitleRepository;

    @GetMapping("viewer")
    public List<CodeViewer> getList() {
        return this.codeViewerRepository.findAllBy();
    }

    @GetMapping("/{category}")
    public List<CodeViewer> getListById(@PathVariable("category") String  category) {
        return this.codeViewerRepository.findAllByCodeTitle(this.codeTitleRepository.findByCategory(category));
   }
}

