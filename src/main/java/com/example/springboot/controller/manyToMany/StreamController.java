package com.example.springboot.controller.manyToMany;

import com.example.springboot.entity.manyToMany.Stream;
import com.example.springboot.service.manyToMany.StreamService;
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
    public Iterable<Stream> getStreams() {
        return streamService.findAllStreams();
    }
}
