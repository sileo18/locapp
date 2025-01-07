package com.beatsell.beat_sell.service;

import com.beatsell.beat_sell.domain.Endereco.Endereco;
import com.beatsell.beat_sell.domain.Endereco.EnderecoDTO;
import com.beatsell.beat_sell.domain.TipoEndereco.TipoEndereco;
import com.beatsell.beat_sell.repositories.EnderecoRepository;
import com.beatsell.beat_sell.repositories.TipoEnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private TipoEnderecoRepository tipoEnderecoRepository;

    public Endereco createEndereco(EnderecoDTO data) {

        Optional<TipoEndereco> tipoEndereco = tipoEnderecoRepository.findById(UUID.fromString(data.tipoId()));
        if (tipoEndereco.isEmpty()) {
            throw new IllegalArgumentException("Tipo de endereço não encontrado");
        }

        Endereco newEndereco = new Endereco();
        newEndereco.setLogradouro(data.logradouro());
        newEndereco.setNumero(data.numero());
        newEndereco.setBairro(data.bairro());
        newEndereco.setUf(data.uf());
        newEndereco.setComplemento(data.complemento());
        newEndereco.setTipo(tipoEndereco.get());

        return enderecoRepository.save(newEndereco);

    }
}
