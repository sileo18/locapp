package com.beatsell.beat_sell.domain.Locadora;


import com.beatsell.beat_sell.domain.Endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "Locadora")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Locadora {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "NomeFantasia", nullable = false, length = 100)
    private String nomeFantasia;

    @Column(name = "CNPJ", nullable = false, length = 14)
    private String cnpj;

    @ManyToOne
    @JoinColumn(name = "Endereco_Id")
    private Endereco endereco;
}
