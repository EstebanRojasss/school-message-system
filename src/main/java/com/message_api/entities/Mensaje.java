package com.message_api.entities;

import jakarta.persistence.*;

@Entity
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String remitente;
    private String destinatario;

    private String contenido;

    public Mensaje(Integer id, String remitente, String destinatario, String contenido) {
        this.id = id;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.contenido = contenido;
    }

    public Mensaje() {
    }

    public Integer getId() {
        return id;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
