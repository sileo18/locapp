package com.beatsell.beat_sell.domain.Veiculo;
import com.beatsell.beat_sell.domain.Estacionamento.Estacionamento;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record VeiculoDTO(@NotNull @Size (max = 20)  String marca,
                         @NotNull @Size (max = 100)  String modelo,
                         Integer anoDeFabricacao,
                         @NotNull @Size (max = 7, message = "Placa deve conter 7 dígitos") String placa,
                         String cor,
                         @NotNull Integer tarifa,
                         @NotNull boolean disponibilidade, //Pensar em trocar para default false
                         Estacionamento estacionamento
) {
}
