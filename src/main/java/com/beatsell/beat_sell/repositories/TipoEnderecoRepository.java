package com.beatsell.beat_sell.repositories;

import com.beatsell.beat_sell.domain.TipoEndereco.TipoEndereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TipoEnderecoRepository extends JpaRepository<TipoEndereco, UUID> {
}
