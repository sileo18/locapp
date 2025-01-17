package com.beatsell.beat_sell.controller;

import com.beatsell.beat_sell.domain.Estacionamento.Estacionamento;
import com.beatsell.beat_sell.domain.Estacionamento.EstacionamentoDTO;
import com.beatsell.beat_sell.service.EstacionamentoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estacionamento")
public class EstacionamentoController {

    @Autowired
    EstacionamentoService estacionamentoService;

    @PostMapping
    public ResponseEntity<Estacionamento> create(@Valid @RequestBody EstacionamentoDTO body) {

        Estacionamento novoEstacionamento = estacionamentoService.create(body);

        return ResponseEntity.ok(novoEstacionamento);
    }

    /*@GetMapping
    public ResponseEntity<List<Estacionamento>> getAll() {

        List<Estacionamento> allEstacionamento = estacionamentoService.getAllEstacionamento();

        return ResponseEntity.ok(allEstacionamento);
    }*/

    @GetMapping
    public ResponseEntity<List<Estacionamento>> getAllEstacionamentosWithVeiculos() {
        List<Estacionamento> estacionamentos = estacionamentoService.getAllEstacionamentoWithVeiculo();
        return ResponseEntity.ok(estacionamentos);
    }
}
