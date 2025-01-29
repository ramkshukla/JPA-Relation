package com.example.springboot.UserRelation.service.manyToMany;

import com.example.springboot.UserRelation.service.model.manyToMany.StreamViewerDTO;
import com.example.springboot.UserRelation.service.repository.manyToMany.StreamRepository;
import org.springframework.stereotype.Service;

@Service
public class StreamService {

    private final StreamRepository streamRepository;

    StreamService(StreamRepository streamRepository) {
        this.streamRepository = streamRepository;
    }

    public StreamViewerDTO findAllStreams(){
        StreamViewerDTO streamViewerDTO = new StreamViewerDTO();
        streamViewerDTO.setMessage("Data successfully retrieved");
        streamViewerDTO.setStatus("200");
        streamViewerDTO.setStreams(streamRepository.findAll());
        return streamViewerDTO;
    }
}

