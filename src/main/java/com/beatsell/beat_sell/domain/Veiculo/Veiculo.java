package com.beatsell.beat_sell.domain.Veiculo;

import com.beatsell.beat_sell.domain.Estacionamento.Estacionamento;
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

    @Column(name = "AnoFabricacao")
    private Integer anoFabricacao; // Usando Integer para armazenar o ano

    @Column(name = "Placa", length = 7)
    private String placa;

    @Column(name = "Cor", length = 20)
    private String cor;

    @Column(name = "Tarifa", nullable = false)
    private Integer tarifa;

    @Column(name = "Disponibilidade")
    private Boolean disponibilidade;

    @ManyToOne
    @JoinColumn(name = "Estacionamento_Id")
    private Estacionamento estacionamento;



}
