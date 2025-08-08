package com.message_api.service;


import com.message_api.entities.Mensaje;
import com.message_api.repository.MessageRepository;
import com.message_api.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final UsuarioRepository usuarioRepository;
    private final MessageRepository messageRepository;


    public MessageService(UsuarioRepository usuarioRepository, MessageRepository messageRepository) {
        this.usuarioRepository = usuarioRepository;
        this.messageRepository = messageRepository;
    }

    public void sendMessage(String remitente, String destinatario, String contenido){
        Mensaje mensaje = new Mensaje();
        mensaje.setDestinatario(destinatario);
        mensaje.setRemitente(remitente);
        mensaje.setContenido(contenido);

        messageRepository.save(mensaje);

        System.out.println("Mensaje guardado correctamente.");
    }

}
