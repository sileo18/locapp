package com.beatsell.beat_sell.controller;


import com.beatsell.beat_sell.domain.Locadora.Locadora;
import com.beatsell.beat_sell.domain.Veiculo.Veiculo;
import com.beatsell.beat_sell.domain.Veiculo.VeiculoDTO;
import com.beatsell.beat_sell.repositories.VeiculoRepository;
import com.beatsell.beat_sell.service.VeiculoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/api/veiculo")
public class VeiculoController {

    @Autowired
    VeiculoService veiculoService;

    @PostMapping
    public ResponseEntity<Veiculo> create(@Valid @RequestBody VeiculoDTO body) {

        Veiculo novoVeiculo = veiculoService.create(body);

        return ResponseEntity.ok(novoVeiculo);

    }

    @GetMapping
    public ResponseEntity<List<Veiculo>> getAll() {

        List<Veiculo> allVeiculo = veiculoService.getAllVeiculo();

        return ResponseEntity.ok(allVeiculo);
    }

    @GetMapping("/estacionamento")
    public ResponseEntity<List<Veiculo>> getAllVeiculosInOneEstacionamento(@RequestParam UUID id) {

        List<Veiculo> listVeiculo = veiculoService.getAllVeiculosInOneEstacionamento(id);

        return  ResponseEntity.ok(listVeiculo);

    }
}
