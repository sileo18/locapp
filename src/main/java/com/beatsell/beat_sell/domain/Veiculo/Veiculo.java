package com.beatsell.beat_sell.domain.Veiculo;

import com.beatsell.beat_sell.domain.Estacionamento.Estacionamento;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "Veiculo")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "Marca", nullable = false, length = 20)
    private String marca;

    @Column(name = "Modelo", nullable = false, length = 100)
    private String modelo;

    @Column(name = "anofabricacao")
    private Integer anofabricacao; // Usando Integer para armazenar o ano

    @Column(name = "Placa", length = 7)
    private String placa;

    @Column(name = "Cor", length = 20)
    private String cor;

    @Column(name = "Tarifa", nullable = false)
    private Integer tarifa;

    @Column(name = "Disponibilidade")
    private Boolean disponibilidade;

    @ManyToOne
    @JoinColumn(name = "estacionamento_id")
    @JsonBackReference
    private Estacionamento estacionamento;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacao(Integer anofabricacao) {
        this.anofabricacao = anofabricacao;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTarifa(Integer tarifa) {
        this.tarifa = tarifa;
    }

    public void setEstacionamento(Estacionamento estacionamentoid) {
        this.estacionamento = estacionamentoid;
    }
}
