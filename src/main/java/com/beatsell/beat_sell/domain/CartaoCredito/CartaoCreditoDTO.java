package com.beatsell.beat_sell.domain.CartaoCredito;

import com.beatsell.beat_sell.domain.Usuario.Usuario;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CartaoCreditoDTO(@Size (max = 16, message = "Número do cartão deve conter 16 dígitos") String numero,
                               @NotNull (message = "CVV não pode ser nulo") String cvv,
                               @NotNull (message = "Senha não pode ser nula") String senha,
                               Usuario usuario
) {
}
