package com.beatsell.beat_sell.controller;

import com.beatsell.beat_sell.domain.Endereco.Endereco;
import com.beatsell.beat_sell.domain.Endereco.EnderecoDTO;
import com.beatsell.beat_sell.service.EnderecoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public ResponseEntity<Endereco> create(@Valid @RequestBody  EnderecoDTO body) {
        Endereco novoEndereco = enderecoService.createEndereco(body);
        return  ResponseEntity.ok(novoEndereco);
    }

    @GetMapping
    public ResponseEntity<List<Endereco>> get() {
        List<Endereco> allEndereco = enderecoService.getAllEndereco();

        return ResponseEntity.ok(allEndereco);
    }
}
