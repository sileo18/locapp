package com.beatsell.beat_sell.domain.Usuario;

import com.beatsell.beat_sell.domain.Endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;


import java.util.UUID;

@Table(name = "Usuario")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "Nome", length = 100)
    private String nome;

    @Column(name = "CPF", nullable = false, unique = true, length = 14)
    private String cpf;

    @Column(name = "CNH", nullable = false, unique = true, length = 15)
    private String cnh;

    @ManyToOne
    @JoinColumn(name = "EnderecoId")
    private Endereco endereco;

    public void setNome(String nome) {
        nome = this.nome;
    }

    public void setCpf(String cpf) {
        cpf = this.cpf;
    }

    public void setCnh(String cnh) {
        cnh = this.cnh;
    }

    public void setEndereco(Endereco endereco) {
        endereco = this.endereco;
    }
}
