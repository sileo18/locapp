package com.beatsell.beat_sell.domain.Usuario;

import com.beatsell.beat_sell.domain.Endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
    @JoinColumn(name = "Endereco_Id")
    private Endereco endereco;
}
