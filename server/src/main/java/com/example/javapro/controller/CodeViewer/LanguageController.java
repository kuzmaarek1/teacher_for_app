package com.example.javapro.controller.CodeViewer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.javapro.model.CodeViewer.Language;
import com.example.javapro.repository.CodeViewer.LanguageRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("language")
public class LanguageController {
    @Autowired
    private LanguageRepository languageRepository;

    @GetMapping("category")
    public List<Language> getLanguage() {
        return this.languageRepository.findAllBy();
    }
}