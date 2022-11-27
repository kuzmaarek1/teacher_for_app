package com.example.javapro.services.CodeViewer;

import com.example.javapro.repository.CodeViewer.CodeTitleRepository;
import com.example.javapro.repository.CodeViewer.LanguageRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import java.util.List;
import java.util.ArrayList;

import com.example.javapro.model.CodeViewer.CodeViewer;
import com.example.javapro.repository.CodeViewer.CodeViewerRepository;

@Component
public class CodeViewerServices {
    @Autowired
    private CodeViewerRepository codeViewerRepository;

    @Autowired
    private CodeTitleRepository codeTitleRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void run() throws Exception {
/*
        List <CodeViewer> codeViewers  = new ArrayList<CodeViewer>();
        codeViewers.add(new CodeViewer(this.codeTitleRepository.getOne(2L),"SimpleApplication.java",null));
        codeViewers.add(new CodeViewer(this.codeTitleRepository.getOne(2L),"SimpleApplication.java",null));

        codeViewers.add(new CodeViewer(this.codeTitleRepository.getOne(4L),
                "SimpleApplication.java",
                "package jp.springboot.simple;\n" +
                        "import org.springframework.boot.SpringApplication;\n" +
                        "import org.springframework.boot.autoconfigure.SpringBootApplication;\n" +
                        "@SpringBootApplication\n" +
                        "public class SimpleApplication {\n" +
                        "\tpublic static void main(String[] args) {\n" +
                        "\t\tSpringApplication.run(SimpleApplication.class, args);\n" +
                        "\t}\n" +
                        "}\n"));
        codeViewers.add(new CodeViewer(this.codeTitleRepository.getOne(4L),
                "Controller.java",
                "package jp.springboot.simple;\n" +
                        "import org.springframework.web.bind.annotation.*;\n" +
                        "@RestController\n" +
                        "public class Controller {\n" +
                        " \t@GetMapping(\"/\")\n" +
                        " \tpublic String home() {\n" +
                        " \t\treturn \"<html><body><h1>@GetMapping(\\\"/\\\")</h1></body></html>\";\n" +
                        " \t}\n" +
                        " \t@GetMapping(\"/page\")\n" +
                        " \tpublic String page() {\n" +
                        " \t\treturn \"<html><body><h1>@GetMapping(\\\"/page\\\")</h1></body></html>\";\n" +
                        " \t}\n" +
                        "}"));
        for(int i=0;i<codeViewers.size();i++) {
            this.codeViewerRepository.save(codeViewers.get(i));
        }
        */
    }
}
