package com.example.javapro.services.CodeViewer;

import com.example.javapro.JavaProApplication;
import com.example.javapro.model.CodeViewer.Language;
import com.example.javapro.repository.CodeViewer.LanguageRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import java.util.List;
import java.util.ArrayList;

import com.example.javapro.model.CodeViewer.CodeTitle;
import com.example.javapro.repository.CodeViewer.CodeTitleRepository;


@Component
public class CodeTitleServices {
    @Autowired
    private CodeTitleRepository codeTitleRepository;

    @Autowired
    private LanguageRepository languageRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void run() throws Exception {
/*
        List<CodeTitle> codeTitle = new ArrayList<CodeTitle>();
        codeTitle.add(new CodeTitle("HTML DOM", this.languageRepository.getOne(1L)));
        codeTitle.add(new CodeTitle("Tablice", this.languageRepository.getOne(2L)));
        codeTitle.add(new CodeTitle("Klasa", this.languageRepository.getOne(3L)));
        codeTitle.add(new CodeTitle("Spring Boot – mapowanie żądania typu GET", this.languageRepository.getOne(4L)));

       for (int i = 0; i < codeTitle.size(); i++) {
            this.codeTitleRepository.save(codeTitle.get(i));
        }
 */
    }
}
