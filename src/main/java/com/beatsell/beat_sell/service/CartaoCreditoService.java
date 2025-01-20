package com.beatsell.beat_sell.service;

import com.beatsell.beat_sell.domain.CartaoCredito.CartaoCredito;
import com.beatsell.beat_sell.domain.CartaoCredito.CartaoCreditoDTO;
import com.beatsell.beat_sell.domain.Usuario.Usuario;
import com.beatsell.beat_sell.repositories.CartaoCreditoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.UUID;

public class CartaoCreditoService {

    @Autowired
    private CartaoCreditoRepository repository;

    @Autowired
    private UsuarioService serviceUsuario;

    @Transactional
    public CartaoCredito create(CartaoCreditoDTO data) {

        CartaoCredito novoCartao = new CartaoCredito();

        Optional<Usuario> usuario = serviceUsuario.getUsuarioById(data.usuario().getId());
        if (usuario.isEmpty()) {
            throw new IllegalArgumentException("Usuário não encontrado");
        }

        novoCartao.setCvv(data.cvv());
        novoCartao.setSenha(data.senha());
        novoCartao.setNumero(data.numero());
        novoCartao.setUsuario(usuario.get());

        return novoCartao;
    }

    @Transactional
    public void deleteCartao(UUID id) {

        /*Optional<Usuario> usuario = repository.findById(id);

        if(usuario.isEmpty()) {
            throw new RuntimeException("Usuário não encontrado com o ID: " + id);
        }*/

        repository.deleteById(id);
        return;
    }

}
