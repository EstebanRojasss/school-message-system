package com.message_api.dto;

public record MessageRequestDto(String remitente,
                                String destinatario,
                                String contenido) {
    
}
