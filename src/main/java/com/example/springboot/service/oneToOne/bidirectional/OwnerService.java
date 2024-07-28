package com.example.springboot.service.oneToOne.bidirectional;

import com.example.springboot.model.oneToOne.bidirectional.Owner;
import com.example.springboot.repository.oneToOne.bidirectional.OwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

    private final OwnerRepository ownerRepository;

   public OwnerService(OwnerRepository ownerRepository){
        this.ownerRepository = ownerRepository;
    }

    public Iterable<Owner> findOwner(){
       return ownerRepository.findAll();
    }
}
