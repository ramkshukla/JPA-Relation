package com.example.springboot.service.manyToMany;

import com.example.springboot.entity.manyToMany.Viewer;
import com.example.springboot.repository.manyToMany.ViewerRepository;
import org.springframework.stereotype.Service;

@Service
public class ViewerService {
    private final ViewerRepository viewerRepository;
    ViewerService(ViewerRepository viewerRepository) {
        this.viewerRepository = viewerRepository;
    }

    public Iterable<Viewer> findAllViwers() {
        return viewerRepository.findAll();
    }
}
