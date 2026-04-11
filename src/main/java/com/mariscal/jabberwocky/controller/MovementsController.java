package com.mariscal.jabberwocky.controller;

import com.mariscal.jabberwocky.model.Movement;
import com.mariscal.jabberwocky.service.MovementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/movements")
public class MovementsController {

    private final MovementService service;

    public MovementsController(MovementService service) {
        this.service = service;
    }

    @GetMapping
    public List<Movement> getAll() {
        return service.findAll();
    }
}