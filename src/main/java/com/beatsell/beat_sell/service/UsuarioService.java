package com.beatsell.beat_sell.service;

import com.beatsell.beat_sell.controller.EnderecoController;
import com.beatsell.beat_sell.domain.Endereco.Endereco;
import com.beatsell.beat_sell.domain.Estacionamento.Estacionamento;
import com.beatsell.beat_sell.domain.Usuario.Usuario;
import com.beatsell.beat_sell.domain.Usuario.UsuarioRequestDTO;
import com.beatsell.beat_sell.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private EnderecoService enderecoService;

    @Transactional
    public Usuario createUsuario(UsuarioRequestDTO data) {

        Usuario novoUsuario = new Usuario();

        novoUsuario.setNome(data.nome());
        novoUsuario.setCpf(data.cpf());
        novoUsuario.setCnh(data.cnh());

        Endereco novoEndereco =  enderecoService.createEndereco(data.endereco());
        novoUsuario.setEndereco(novoEndereco);

        repository.save(novoUsuario);

        return novoUsuario;

    }

    public List<Usuario> getAllUsuario() {

        List<Usuario> allUsuario = repository.findAll();

        return allUsuario;
    }

    public Optional<Usuario> getUsuarioById(UUID id) {

        Optional<Usuario> usuario = repository.findById(id);

        return usuario;

    }

    public void deleteUsuario(UUID id) {

        /*Optional<Usuario> usuario = repository.findById(id);

        if(usuario.isEmpty()) {
            throw new RuntimeException("Usuário não encontrado com o ID: " + id);
        }*/

        repository.deleteById(id);
        return;
    }

}
