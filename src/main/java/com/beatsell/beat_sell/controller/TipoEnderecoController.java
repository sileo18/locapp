package com.beatsell.beat_sell.controller;

import com.beatsell.beat_sell.domain.TipoEndereco.TipoEndereco;
import com.beatsell.beat_sell.domain.TipoEndereco.TipoEnderecoDTO;
import com.beatsell.beat_sell.service.TipoEnderecoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipoendereco")
public class TipoEnderecoController {

    @Autowired
    private TipoEnderecoService tipoEnderecoService;

    @PostMapping
    public ResponseEntity<TipoEndereco> create(@Valid @RequestBody TipoEnderecoDTO body) {

        TipoEndereco newTipoEndereco = tipoEnderecoService.createTipoEndereco(body);

        return ResponseEntity.ok(newTipoEndereco);
    }

    @GetMapping
    public  ResponseEntity<List<TipoEndereco>> get() {

        List<TipoEndereco> allTipoEndereco = tipoEnderecoService.getAllTipoEndereco();

        return  ResponseEntity.ok(allTipoEndereco);
    }
}
