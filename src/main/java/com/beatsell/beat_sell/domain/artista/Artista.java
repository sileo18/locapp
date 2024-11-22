package com.beatsell.beat_sell.domain.artista;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "Artista")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Artista {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String sobre;
}
