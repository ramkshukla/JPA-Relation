package com.example.springboot.service.oneToOne.bidirectional;

import com.example.springboot.entity.oneToOne.bidirectional.Owner;
import com.example.springboot.repository.oneToOne.bidirectional.OwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

    private final OwnerRepository ownerRepository;

   public OwnerService(OwnerRepository ownerRepository){
        this.ownerRepository = ownerRepository;
    }

//    public Iterable<OwnerCarInfo> findOwner(){
//        List<Tuple> tuples = ownerRepository.findAllCarsTuple();
//        return tuples.stream()
//                .map(tuple -> new OwnerCarInfo(
//                        tuple.get("firstName", String.class),
//                        tuple.get("brand", String.class)))
//                .collect(Collectors.toList());
//       return ownerRepository.findAllCars();
//    }


    public Iterable<Owner> getOwners(){
       return ownerRepository.findAll();
    }
}
