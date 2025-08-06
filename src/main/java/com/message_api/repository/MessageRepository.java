package com.message_api.repository;

import com.message_api.entities.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Mensaje, Long> {
}
