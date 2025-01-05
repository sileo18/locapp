package com.beatsell.beat_sell.domain.Endereco;

import com.beatsell.beat_sell.domain.TipoEndereco.TipoEndereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@Table(name = "Endereco")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Endereco {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "Logradouro", nullable = false, length = 100)
    private String logradouro;

    @Column(name = "Numero", nullable = false, length = 20)
    private String numero;

    @Column(name = "Bairro", length = 50)
    private String bairro;

    @Column(name = "UF", length = 2)
    private String uf;

    @Column(name = "Complemento", length = 100)
    private String complemento;

    @ManyToOne
    @JoinColumn(name = "Tipo_Id")
    private TipoEndereco tipo;
}
