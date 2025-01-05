package com.beatsell.beat_sell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailRepository, UUID> {
}
