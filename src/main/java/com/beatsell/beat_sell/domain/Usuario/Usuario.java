package com.beatsell.beat_sell.domain.Usuario;

import com.beatsell.beat_sell.domain.Endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;


import java.util.UUID;

@Table(name = "usuario")
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
    @JoinColumn(name = "enderecoid")
    private Endereco endereco;

    public void setNome(String nome) {
        this.nome = nome ;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf ;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
