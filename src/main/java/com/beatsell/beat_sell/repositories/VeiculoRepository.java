package com.beatsell.beat_sell.repositories;

import com.beatsell.beat_sell.domain.Veiculo.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VeiculoRepository extends JpaRepository<Veiculo, UUID> {
}
