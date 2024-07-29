package com.example.springboot.service.manyToMany;

import com.example.springboot.entity.manyToMany.Stream;
import com.example.springboot.repository.manyToMany.StreamRepository;
import org.springframework.stereotype.Service;

@Service
public class StreamService {
    private final StreamRepository streamRepository;
    StreamService(StreamRepository streamRepository) {
        this.streamRepository = streamRepository;
    }

    public Iterable<Stream> findAllStreams(){
        return streamRepository.findAll();
    }
}

