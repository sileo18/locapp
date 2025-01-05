package com.beatsell.beat_sell.repositories;

import com.beatsell.beat_sell.domain.Estacionamento.Estacionamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CartaoCreditoRepository extends JpaRepository<Estacionamento, UUID> {
}
