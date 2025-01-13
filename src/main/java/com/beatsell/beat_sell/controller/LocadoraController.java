package com.beatsell.beat_sell.controller;

import com.beatsell.beat_sell.domain.Locadora.Locadora;
import com.beatsell.beat_sell.domain.Locadora.LocadoraDTO;
import com.beatsell.beat_sell.service.LocadoraService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locadora")
public class LocadoraController {

    @Autowired
    private LocadoraService locadoraService;

    @PostMapping
    public ResponseEntity<Locadora> create(@Valid @RequestBody LocadoraDTO body) {

        Locadora novaLocadora = locadoraService.create(body);

        return ResponseEntity.ok(novaLocadora);
    }

    @GetMapping
    public ResponseEntity<List<Locadora>> getAll() {

        List<Locadora> allLocadora = locadoraService.getAllLocadora();

        return ResponseEntity.ok(allLocadora);
    }
}
