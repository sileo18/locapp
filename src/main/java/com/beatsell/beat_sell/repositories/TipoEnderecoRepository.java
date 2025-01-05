package com.beatsell.beat_sell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TipoEnderecoRepository extends JpaRepository<TipoEnderecoRepository, UUID> {
}
