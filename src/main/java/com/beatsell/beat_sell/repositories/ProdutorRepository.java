package com.beatsell.beat_sell.repositories;

import com.beatsell.beat_sell.domain.produtor.Produtor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProdutorRepository extends JpaRepository<Produtor, UUID> {
}
