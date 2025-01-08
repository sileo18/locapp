package com.beatsell.beat_sell.domain.Usuario;


import com.beatsell.beat_sell.domain.Endereco.EnderecoDTO;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UsuarioRequestDTO(@NotNull(message = "Nome não pode ser nulo") String nome,
                                @Size(max= 14, message = "CPF deve conter no máximo 14 caracteres") String cpf,
                                @Size(max= 15, message = "CNH deve conter no máximo 14 caracteres") String cnh,
                                @NotNull(message = "Endereço não pode ser nulo") EnderecoDTO endereco
) {
}
