package com.example.javapro.controller.WebTools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.javapro.model.WebTools.WebTools;
import com.example.javapro.repository.WebTools.WebToolsRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("web/")
public class WebToolsController {
    @Autowired
    private WebToolsRepository webToolsRepository;

    @GetMapping("tools")
    public List<WebTools> getWebTools() {
        return this.webToolsRepository.findAllBy();
    }
}