package com.beatsell.beat_sell.domain.Telefone;

import com.beatsell.beat_sell.domain.Usuario.Usuario;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TelefoneDTO(@NotNull ( message = "Número não pode ser nulo") @Size (max = 9, message = "Número deve conter no máximo 9 dígitos") String numero,
                          @NotNull ( message = "DDD não pode ser nulo") String DDD,
                          String tipo,
                          Usuario usuario
) {
}
