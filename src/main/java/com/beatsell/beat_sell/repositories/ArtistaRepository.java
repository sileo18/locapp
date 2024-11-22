package com.beatsell.beat_sell.repositories;

import com.beatsell.beat_sell.domain.artista.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ArtistaRepository extends JpaRepository<Artista, UUID> {

}
