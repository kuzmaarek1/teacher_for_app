package com.example.javapro.controller.CodeViewer;

import com.example.javapro.repository.CodeViewer.LanguageRepository;
import com.example.javapro.services.CodeViewer.LanguageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.javapro.model.CodeViewer.CodeTitle;
import com.example.javapro.repository.CodeViewer.CodeTitleRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("codeTitle/")
public class CodeTitleController {
    @Autowired
    private CodeTitleRepository codeTitleRepository;

    @Autowired
    private LanguageRepository languageRepository;

    @GetMapping("viewer")
    public List<CodeTitle> getList() {
        return this.codeTitleRepository.findAllBy();
    }

    @GetMapping("/{language}")
    public List<CodeTitle> getListByLanguage(@PathVariable("language") String language) {
        return this.codeTitleRepository.findAllByLanguage(this.languageRepository.findByCategory(language));
    }
}