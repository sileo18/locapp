package com.beatsell.beat_sell.repositories;

import com.beatsell.beat_sell.domain.Email.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<Email, UUID> {
}
