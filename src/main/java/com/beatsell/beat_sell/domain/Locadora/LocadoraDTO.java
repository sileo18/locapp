package com.beatsell.beat_sell.domain.Locadora;


import com.beatsell.beat_sell.domain.Endereco.EnderecoDTO;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record LocadoraDTO(
        @NotNull(message = "Nome fantasia não pode ser nulo") String nomefantasia,
        @NotNull(message = "CNPJ não pode ser nulo")

        @Size(max = 14, message = "CNPJ deve ter no máximo 14 caracteres") String cnpj,
        @NotNull(message = "Endereço não pode ser nulo") EnderecoDTO endereco
) {
}