package com.beatsell.beat_sell.repositories;

import com.beatsell.beat_sell.domain.Telefone.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TelefoneRepository extends JpaRepository<Telefone, UUID> {
}
