package com.example.springboot.UserRelation.service.controller.manyToMany;

import com.example.springboot.UserRelation.service.model.manyToMany.StreamViewerDTO;
import com.example.springboot.UserRelation.service.manyToMany.StreamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "stream")
public class StreamController {

    private final StreamService streamService;

    StreamController(StreamService streamService) {
        this.streamService = streamService;
    }

    @GetMapping
    public StreamViewerDTO getStreams() {
        return streamService.findAllStreams();
    }
}
