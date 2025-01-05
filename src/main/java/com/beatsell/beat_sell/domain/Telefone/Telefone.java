package com.beatsell.beat_sell.domain.Telefone;

import com.beatsell.beat_sell.domain.Usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "Telefone")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Telefone {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "Numero", nullable = false, unique = true, length = 9)
    private String numero;

    @Column(name = "Tipo", length = 10)
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "Usuario_Id", nullable = false)
    private Usuario usuario;
}
