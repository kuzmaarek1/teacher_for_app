package com.example.javapro.services.SliderViewer;

import com.example.javapro.repository.CodeViewer.CodeTitleRepository;
import com.example.javapro.repository.SliderViewer.SubjectRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import java.util.List;
import java.util.ArrayList;

import com.example.javapro.model.SliderViewer.Title;
import com.example.javapro.repository.SliderViewer.TitleRepository;

@Component
public class TitleServices {
    @Autowired
    private TitleRepository titleRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void run() throws Exception {
/*
        List <Title> title = new ArrayList<Title>();
        title.add(new Title("Spring Boot", this.subjectRepository.getOne(1L)));

        for(int i=0;i<title.size();i++){
            this.titleRepository.save(title.get(i));
        }
*/
    }
}
