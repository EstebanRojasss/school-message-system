package com.message_api.controller;

import com.message_api.dto.MessageRequestDto;
import com.message_api.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mensajes")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public ResponseEntity<Void> sendMessage(@RequestBody MessageRequestDto message){
        messageService.enviarMensaje(message.remitente(), message.destinatario(), message.contenido());
        return ResponseEntity.ok().build();
    }

}
