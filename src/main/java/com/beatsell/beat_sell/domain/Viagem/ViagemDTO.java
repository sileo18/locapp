package com.beatsell.beat_sell.domain.Viagem;

import com.beatsell.beat_sell.domain.Usuario.Usuario;
import com.beatsell.beat_sell.domain.Veiculo.Veiculo;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record ViagemDTO(Date datainicio,
                        Date datafim,
                        @NotNull Integer kminicial,
                        @NotNull Integer kmfinal,
                        @NotNull Integer valortotal,
                        @NotNull  Usuario usuario,
                        @NotNull Veiculo veiculo
) {
}
