package com.beatsell.beat_sell.controller;

import com.beatsell.beat_sell.domain.Usuario.Usuario;
import com.beatsell.beat_sell.domain.Usuario.UsuarioRequestDTO;
import com.beatsell.beat_sell.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> create(@Valid @RequestBody UsuarioRequestDTO body) {
        Usuario novoUsuario = usuarioService.createUsuario(body);

        URI location = URI.create("/api/usuarios/" + novoUsuario.getId());

        return ResponseEntity.created(location).body(novoUsuario);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> getAll() {
        List<Usuario> allUsuario = usuarioService.getAllUsuario();
        return  ResponseEntity.ok(allUsuario);
    }

    @DeleteMapping("/usuario")
    public ResponseEntity<Void> deleteUserById(@RequestParam UUID id) {
        try {
            usuarioService.deleteUsuario(id);
            return ResponseEntity.noContent().build(); // Retorna 204 No Content
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build(); // Retorna 404 Not Found se o usuário não existir
        }
    }
}
