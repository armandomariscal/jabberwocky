package com.mariscal.jabberwocky.service;

import com.mariscal.jabberwocky.model.Movement;
import com.mariscal.jabberwocky.repository.MovementRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovementService {

    private final MovementRepository repository;

    public MovementService(MovementRepository repository) {
        this.repository = repository;
    }
    public List<Movement> findAll() {
        return repository.findAll();
    }
}