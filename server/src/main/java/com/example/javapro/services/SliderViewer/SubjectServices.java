package com.example.javapro.services.SliderViewer;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import java.util.List;
import java.util.ArrayList;

import com.example.javapro.model.SliderViewer.Subject;
import com.example.javapro.repository.SliderViewer.SubjectRepository;

@Component
public class SubjectServices {
    @Autowired
    private SubjectRepository subjectRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void run() throws Exception {
/*
        List <Subject> subject = new ArrayList<Subject>();
        subject.add(new Subject("Technologie Web i Java"));

        for(int i=0;i<subject.size();i++){
            this.subjectRepository.save(subject.get(i));
        }
*/
    }
}
