package com.beatsell.beat_sell.repositories;

import com.beatsell.beat_sell.domain.Endereco.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EnderecoRepository extends JpaRepository<Endereco, UUID> {
}
