package com.example.springboot.controller.oneToOne.bidirectional;

import com.example.springboot.model.oneToOne.bidirectional.Owner;
import com.example.springboot.service.oneToOne.bidirectional.OwnerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/owner")
public class OwnerController {
    private final OwnerService ownerService;
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping
    public Iterable<Owner> getOwners() {
        return ownerService.findOwner();
    }
}
