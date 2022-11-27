package com.example.javapro.services.CodeViewer;

import com.example.javapro.JavaProApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import java.util.List;
import java.util.ArrayList;

import com.example.javapro.model.CodeViewer.Language;
import com.example.javapro.repository.CodeViewer.LanguageRepository;

@Component
public class LanguageServices {
    @Autowired
    private LanguageRepository languageRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void run() throws Exception {
        /*
        List<Language> language = new ArrayList<Language>();
        language.add(new Language("HTML"));
        language.add(new Language("JavaScript"));
        language.add(new Language("PHP"));
        language.add(new Language("Java"));

        for (int i = 0; i < language.size(); i++) {
            this.languageRepository.save(language.get(i));
        }
         */
    }
}
