package com.example.javapro.controller.SliderViewer;

import com.example.javapro.model.CodeViewer.CodeViewer;
import com.example.javapro.model.SliderViewer.SliderViewer;
import com.example.javapro.repository.CodeViewer.CodeTitleRepository;
import com.example.javapro.repository.SliderViewer.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.javapro.repository.SliderViewer.SliderViewerRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("slider/")
public class SliderViewerController {
    @Autowired
    private SliderViewerRepository sliderViewerRepository;

    @Autowired
    private TitleRepository titleRepository;

    @GetMapping("viewer")
    public List<SliderViewer> getSlider() {
        return this.sliderViewerRepository.findAllBy();
    }

    @GetMapping("/{category}")
    public List<SliderViewer> getListByCategory(@PathVariable("category") String  category) {
        return this.sliderViewerRepository.findAllByTitle(this.titleRepository.findByCategory(category));
    }
}
