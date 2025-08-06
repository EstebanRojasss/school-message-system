package com.message_api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;

    public Usuario(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}
