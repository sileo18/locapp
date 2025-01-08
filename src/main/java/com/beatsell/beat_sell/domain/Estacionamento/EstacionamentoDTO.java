package com.beatsell.beat_sell.domain.Estacionamento;

import com.beatsell.beat_sell.domain.Endereco.EnderecoDTO;
import com.beatsell.beat_sell.domain.Locadora.LocadoraDTO;

import java.util.UUID;

public record EstacionamentoDTO (String nome, UUID locadoraid, EnderecoDTO endereco){
}
