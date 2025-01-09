package com.beatsell.beat_sell.domain.Estacionamento;

import com.beatsell.beat_sell.domain.Endereco.EnderecoDTO;
import com.beatsell.beat_sell.domain.Locadora.LocadoraDTO;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record EstacionamentoDTO (@NotNull (message = "Nome não pode ser nulo") String nome,
                                 @NotNull UUID locadoraid,
                                 @NotNull EnderecoDTO endereco){
}
