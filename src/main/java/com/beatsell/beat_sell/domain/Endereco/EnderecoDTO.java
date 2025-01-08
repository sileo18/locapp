package com.beatsell.beat_sell.domain.Endereco;

import jakarta.validation.constraints.NotNull;

public record EnderecoDTO(@NotNull (message = "Logradoura não pode ser nulo") String logradouro,
                          @NotNull (message = "Número não pode ser nulo") String numero,
                          String bairro,
                          String uf,
                          String complemento,
                          @NotNull ( message = "É necessário especificar o tipo de endereço") String tipoId) {
}
