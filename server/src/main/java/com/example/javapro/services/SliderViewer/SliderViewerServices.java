package com.example.javapro.services.SliderViewer;

import com.example.javapro.repository.SliderViewer.SubjectRepository;
import com.example.javapro.repository.SliderViewer.TitleRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.ArrayList;

import com.example.javapro.model.SliderViewer.SliderViewer;
import com.example.javapro.repository.SliderViewer.SliderViewerRepository;

@Component
public class SliderViewerServices {
    @Autowired
    private SliderViewerRepository sliderViewerRepository;

    @Autowired
    private TitleRepository titleRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void run() throws Exception {
/*
        Integer countList = new File("img/wyklad").listFiles().length;
        List<File> file = new ArrayList<File>();
        List <byte[]> picInBytes = new ArrayList<byte[]>();
        List <FileInputStream> fileInputStream  = new ArrayList<FileInputStream>();
        for (int i = 0; i < countList; i++) {
            file.add(new File("img/wyklad/0"+i+".png"));

            picInBytes.add(new byte[(int) file.get(i).length()]);
            fileInputStream.add(new FileInputStream(file.get(i)));
            fileInputStream.get(i).read(picInBytes.get(i));
            fileInputStream.get(i).close();
        }
        List <SliderViewer> sliderViewers = new ArrayList<SliderViewer>();
        sliderViewers.add(new SliderViewer(this.titleRepository.getOne(1L), picInBytes.get(0)));
        sliderViewers.add(new SliderViewer(this.titleRepository.getOne(1L), picInBytes.get(1)));
        sliderViewers.add(new SliderViewer(this.titleRepository.getOne(1L), picInBytes.get(2)));
        sliderViewers.add(new SliderViewer(this.titleRepository.getOne(1L), picInBytes.get(3)));
        sliderViewers.add(new SliderViewer(this.titleRepository.getOne(1L), picInBytes.get(4)));
        sliderViewers.add(new SliderViewer(this.titleRepository.getOne(1L), picInBytes.get(5)));
        sliderViewers.add(new SliderViewer(this.titleRepository.getOne(1L), picInBytes.get(6)));

        for(int i=0;i<sliderViewers.size();i++){
            this.sliderViewerRepository.save(sliderViewers.get(i));
        }
*/
    }
}
