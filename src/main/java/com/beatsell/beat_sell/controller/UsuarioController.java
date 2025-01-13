package com.beatsell.beat_sell.controller;

import com.beatsell.beat_sell.domain.Usuario.Usuario;
import com.beatsell.beat_sell.domain.Usuario.UsuarioRequestDTO;
import com.beatsell.beat_sell.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> create(@Valid @RequestBody UsuarioRequestDTO body) {
        Usuario novoUsuario = usuarioService.createUsuario(body);
        return ResponseEntity.ok(novoUsuario);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> getAll() {
        List<Usuario> allUsuario = usuarioService.getAllUsuario();
        return  ResponseEntity.ok(allUsuario);
    }
}
