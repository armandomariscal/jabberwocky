package com.mariscal.jabberwocky.controller;

import com.mariscal.jabberwocky.model.Movement;
import com.mariscal.jabberwocky.repository.MovementRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/movements")
public class MovementsController {

    private final MovementRepository repository;

    public MovementsController(MovementRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Movement> getAll() {
        return repository.findAll();
    }
}