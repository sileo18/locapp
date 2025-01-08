package com.beatsell.beat_sell.service;

import com.beatsell.beat_sell.domain.Endereco.Endereco;
import com.beatsell.beat_sell.domain.Locadora.Locadora;
import com.beatsell.beat_sell.domain.Locadora.LocadoraDTO;
import com.beatsell.beat_sell.repositories.LocadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocadoraService {

    @Autowired
    private LocadoraRepository repository;

    @Autowired
    private EnderecoService enderecoService;


    public Locadora create(LocadoraDTO data) {

        Locadora novaLocadora = new Locadora();

        novaLocadora.setCnpj(data.cnpj());
        novaLocadora.setNomeFantasia(data.nomefantasia());

        Endereco novoEndereco = enderecoService.createEndereco(data.endereco());
        novaLocadora.setEndereco(novoEndereco);

        repository.save(novaLocadora);

        return  novaLocadora;
    }



}
