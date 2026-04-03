package com.mariscal.jabberwocky.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/movements")
public class MovementsController {

    @GetMapping
    public List<Map<String, Object>> getMovements() {
        return List.of(
        );
    }
}