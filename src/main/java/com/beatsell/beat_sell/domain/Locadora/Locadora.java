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

    @Column(name = "nomefantasia", nullable = false, length = 100)
    private String nomefantasia;

    @Column(name = "cnpj", nullable = false, length = 14)
    private String cnpj;

    public void setNomeFantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @ManyToOne
    @JoinColumn(name = "enderecoid")
    private Endereco endereco;

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
