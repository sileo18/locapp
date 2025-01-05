package com.beatsell.beat_sell.repositories;

import com.beatsell.beat_sell.domain.Viagem.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ViagemRepository extends JpaRepository<Viagem, UUID> {
}
