package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstateController {

    @Autowired
    private EstateService estateService;

    @GetMapping("/estates")
    List<Estate> getAll() {
        return estateService.getAll();
    }

    @GetMapping("/estate/{id}")
    Estate getOne(@PathVariable long id) {
        return estateService.getOne(id);
    }
}
