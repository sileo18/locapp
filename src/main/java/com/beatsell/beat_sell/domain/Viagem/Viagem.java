package com.beatsell.beat_sell.domain.Viagem;

import com.beatsell.beat_sell.domain.Endereco.Endereco;
import com.beatsell.beat_sell.domain.Estacionamento.Estacionamento;
import com.beatsell.beat_sell.domain.Usuario.Usuario;
import com.beatsell.beat_sell.domain.Veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name = "Viagem")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Viagem {

    @Id
    @GeneratedValue

    private UUID id;

    @Column(name = "DataInicio")
    private Date dataInicio;

    @Column(name = "DataFim")
    private Date dataFim;

    @Column(name = "KmInicial", nullable = false)
    private Integer kmInicial;

    @Column(name ="KmFinal", nullable = false)
    private Integer kmFinal;

    @Column(name ="valorTotal", nullable = false)
    private Integer valorTotal;

    @ManyToOne
    @JoinColumn(name = "Usuario_Id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "Veiculo_Id")
    private Veiculo veiculo;

}
