package com.beatsell.beat_sell.controller;

import com.beatsell.beat_sell.domain.TipoEndereco.TipoEndereco;
import com.beatsell.beat_sell.domain.TipoEndereco.TipoEnderecoDTO;
import com.beatsell.beat_sell.service.TipoEnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tipoendereco")
public class TipoEnderecoController {

    @Autowired
    private TipoEnderecoService tipoEnderecoService;

    @PostMapping
    public ResponseEntity<TipoEndereco> create(@RequestBody TipoEnderecoDTO body) {
        TipoEndereco newTipoEndereco = this.tipoEnderecoService.createTipoEndereco(body);
        return ResponseEntity.ok(newTipoEndereco);
    }
}
