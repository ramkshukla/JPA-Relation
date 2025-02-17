package com.example.springboot.UserRelation.service.controller.manyToMany;

import com.example.springboot.UserRelation.service.model.manyToMany.StreamViewerDTO;
import com.example.springboot.UserRelation.service.manyToMany.ViewerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/viewer")
public class ViewerController {

    private final ViewerService viewerService;

    ViewerController(ViewerService viewerService) {
        this.viewerService = viewerService;
    }

    @GetMapping
    public StreamViewerDTO getViewers() {
        return viewerService.findAllViwers();
    }
}
