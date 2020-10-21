package com.falabella.catalyst.network.controller;

import com.falabella.catalyst.network.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @Autowired
    ResourceRepository resourceRepository;
}
