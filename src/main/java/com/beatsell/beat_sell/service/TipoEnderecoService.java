package com.beatsell.beat_sell.service;

import com.beatsell.beat_sell.domain.TipoEndereco.TipoEndereco;
import com.beatsell.beat_sell.domain.TipoEndereco.TipoEnderecoDTO;
import com.beatsell.beat_sell.repositories.TipoEnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoEnderecoService {

    @Autowired
    private TipoEnderecoRepository repository;

    public TipoEndereco createTipoEndereco(TipoEnderecoDTO data) {

        TipoEndereco newtipoEndereco = new TipoEndereco();
        newtipoEndereco.setDescricao(data.descricao());

        if (data.descricao() == null || data.descricao().isEmpty()) {
            throw new IllegalArgumentException("A descrição não pode ser nula ou vazia");
        }


        repository.save(newtipoEndereco);

        return newtipoEndereco;
    }

    public List<TipoEndereco> getAllTipoEndereco() {

        List<TipoEndereco> allTipoEndereco = repository.findAll();

        return  allTipoEndereco;

    }
}
