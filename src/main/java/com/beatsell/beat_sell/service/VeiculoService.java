package com.beatsell.beat_sell.service;

import com.beatsell.beat_sell.domain.Estacionamento.Estacionamento;
import com.beatsell.beat_sell.domain.TipoEndereco.TipoEndereco;
import com.beatsell.beat_sell.domain.Veiculo.Veiculo;
import com.beatsell.beat_sell.domain.Veiculo.VeiculoDTO;
import com.beatsell.beat_sell.repositories.EstacionamentoRepository;
import com.beatsell.beat_sell.repositories.VeiculoRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @Autowired
    private EstacionamentoRepository estacionamentoRepository;

    @Transactional
    public Veiculo create(VeiculoDTO data) {

        Optional<Estacionamento> estacionamento = estacionamentoRepository.findById(UUID.fromString(data.estacionamento()));
        if (estacionamento.isEmpty()) {
            throw new IllegalArgumentException("Estacionamento não encontrado");
        }

        Veiculo novoVeiculo = new Veiculo();
        novoVeiculo.setCor(data.cor());
        novoVeiculo.setMarca(data.marca());
        novoVeiculo.setAnoFabricacao(data.anofabricacao());
        novoVeiculo.setModelo(data.modelo());
        novoVeiculo.setPlaca(data.placa());
        novoVeiculo.setTarifa(data.tarifa());
        novoVeiculo.setEstacionamento(estacionamento.get());

        return veiculoRepository.save(novoVeiculo);


    }

    public List<Veiculo> getAllVeiculo() {

        List<Veiculo> allVeiculo = veiculoRepository.findAll();

        return  allVeiculo;
    }

    public List<Veiculo> getAllVeiculosInOneEstacionamento(UUID id) {

        Optional<Estacionamento> estacionamento = estacionamentoRepository.findById(id);

        if (estacionamento.isEmpty()) {
            throw new EntityNotFoundException("Estacionamento não encontrado para o ID: " + id);
        }

        return veiculoRepository.findByEstacionamento(estacionamento.get());

    }

    public void deleteVeiculo(UUID id) {

        veiculoRepository.deleteById(id);

    }
}
