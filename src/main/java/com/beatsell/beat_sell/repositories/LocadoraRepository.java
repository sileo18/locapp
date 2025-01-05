package com.beatsell.beat_sell.repositories;

import com.beatsell.beat_sell.domain.Locadora.Locadora;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LocadoraRepository extends JpaRepository<Locadora, UUID> {

}
