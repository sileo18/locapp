package com.beatsell.beat_sell.domain.Usuario;

import com.beatsell.beat_sell.domain.Endereco.Endereco;
import com.beatsell.beat_sell.domain.Endereco.EnderecoDTO;

public record UsuarioRequestDTO(String nome, String cpf, String cnh, EnderecoDTO endereco) {
}
