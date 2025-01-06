package com.beatsell.beat_sell.service;

import com.beatsell.beat_sell.domain.Usuario.Usuario;
import com.beatsell.beat_sell.domain.Usuario.UsuarioRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public Usuario createUsuario(UsuarioRequestDTO data) {

        Usuario novoUsuario = new Usuario();

        novoUsuario.setNome(data.Nome());
        novoUsuario.setCpf(data.CPF());
        novoUsuario.setCnh(data.CNH());
        novoUsuario.setEndereco(data.endereco());

        return novoUsuario;
    }
}
