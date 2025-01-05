package com.beatsell.beat_sell.domain.TipoEndereco;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "TipoEndereco")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TipoEndereco {

    @Id
    @GeneratedValue
    private UUID id;
    @Column(name = "Descricao", nullable = false, unique = true, length = 50)
    private String descricao;
}
