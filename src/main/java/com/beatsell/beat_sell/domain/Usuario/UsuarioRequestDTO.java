package com.beatsell.beat_sell.domain.Usuario;

import com.beatsell.beat_sell.domain.Endereco.Endereco;

public record UsuarioRequestDTO(String Nome, String CPF, String CNH, Endereco endereco) {
}
