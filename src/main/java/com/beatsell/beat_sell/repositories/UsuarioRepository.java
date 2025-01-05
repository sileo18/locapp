package com.beatsell.beat_sell.repositories;

import com.beatsell.beat_sell.domain.Usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
}
