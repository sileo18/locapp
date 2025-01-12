package com.beatsell.beat_sell.service;

import com.beatsell.beat_sell.domain.Veiculo.Veiculo;
import com.beatsell.beat_sell.domain.Veiculo.VeiculoDTO;
import com.beatsell.beat_sell.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Veiculo create(VeiculoDTO data) {

        Veiculo novoVeiculo = new Veiculo();
        novoVeiculo.setCor(data.cor());
        novoVeiculo.setMarca(data.marca());

        return novoVeiculo;
    }
}
