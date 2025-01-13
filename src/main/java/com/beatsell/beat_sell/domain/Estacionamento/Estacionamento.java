package com.beatsell.beat_sell.domain.Estacionamento;

import com.beatsell.beat_sell.domain.Endereco.Endereco;
import com.beatsell.beat_sell.domain.Locadora.Locadora;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "Estacionamento")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Estacionamento {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "locadoraid")
    private Locadora locadoraid;

    @ManyToOne
    @JoinColumn(name = "enderecoid")
    private Endereco enderecoid;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocadoraid(Locadora locadoraid) {
        this.locadoraid = locadoraid;
    }

    public void setEndereco(Endereco endereco) {
        this.enderecoid = endereco;
    }
}
