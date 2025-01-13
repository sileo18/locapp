package com.beatsell.beat_sell.service;

import com.beatsell.beat_sell.domain.Endereco.Endereco;
import com.beatsell.beat_sell.domain.Estacionamento.Estacionamento;
import com.beatsell.beat_sell.domain.Estacionamento.EstacionamentoDTO;
import com.beatsell.beat_sell.domain.Locadora.Locadora;
import com.beatsell.beat_sell.domain.Locadora.LocadoraDTO;
import com.beatsell.beat_sell.domain.TipoEndereco.TipoEndereco;
import com.beatsell.beat_sell.repositories.EnderecoRepository;
import com.beatsell.beat_sell.repositories.EstacionamentoRepository;
import com.beatsell.beat_sell.repositories.LocadoraRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EstacionamentoService {

    @Autowired
    EstacionamentoRepository estacionamentoRepository;

    @Autowired
    EnderecoService enderecoService;

    @Autowired
    LocadoraRepository locadoraRepository;

    @Transactional
    public Estacionamento create(EstacionamentoDTO data) {

        Estacionamento novoEstacionamento = new Estacionamento();

        Optional<Locadora> locadora = locadoraRepository.findById(UUID.fromString(data.locadoraid()));
        if (locadora.isEmpty()) {
            throw new IllegalArgumentException("Tipo de endereço não encontrado");
        }

        novoEstacionamento.setLocadoraid(locadora.get());
        novoEstacionamento.setNome(data.nome());

        Endereco novoEndereco =  enderecoService.createEndereco(data.enderecoid());
        novoEstacionamento.setEndereco(novoEndereco);

        return  estacionamentoRepository.save(novoEstacionamento);

    }

    public List<Estacionamento> getAllEstacionamento() {

        List<Estacionamento> allEstacionamento = estacionamentoRepository.findAll();

        return allEstacionamento;
    }
}
