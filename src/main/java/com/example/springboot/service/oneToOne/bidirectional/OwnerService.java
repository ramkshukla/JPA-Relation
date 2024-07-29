package com.example.springboot.service.oneToOne.bidirectional;

import com.example.springboot.entity.oneToOne.OwnerCarInfo;
import com.example.springboot.repository.oneToOne.bidirectional.OwnerRepository;
import jakarta.persistence.Tuple;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OwnerService {

    private final OwnerRepository ownerRepository;

   public OwnerService(OwnerRepository ownerRepository){
        this.ownerRepository = ownerRepository;
    }

    public Iterable<OwnerCarInfo> findOwner(){
        List<Tuple> tuples = ownerRepository.findAllCarsTuple();
        return tuples.stream()
                .map(tuple -> new OwnerCarInfo(
                        tuple.get("firstName", String.class),
                        tuple.get("brand", String.class)))
                .collect(Collectors.toList());
//       return ownerRepository.findAllCars();
    }
}
