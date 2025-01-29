package com.example.springboot.UserRelation.service.manyToMany;

import com.example.springboot.UserRelation.service.model.manyToMany.StreamViewerDTO;
import com.example.springboot.UserRelation.service.repository.manyToMany.ViewerRepository;
import org.springframework.stereotype.Service;

@Service
public class ViewerService {
    private final ViewerRepository viewerRepository;
    ViewerService(ViewerRepository viewerRepository) {
        this.viewerRepository = viewerRepository;
    }

    public StreamViewerDTO findAllViwers() {
        StreamViewerDTO streamViewerDTO = new StreamViewerDTO();
        streamViewerDTO.setMessage("Data successfully retrieved");
        streamViewerDTO.setStatus("200");
        streamViewerDTO.setViewers(viewerRepository.findAll());
        return streamViewerDTO;
    }
}
