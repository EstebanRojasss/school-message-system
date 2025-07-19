package com.message_api.service;

import com.message_api.dto.MessageRequestDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MessageService {

    private final RestTemplate restTemplate;

    public MessageService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void enviarMensaje(String remitente, String destinatario, String contenido){
        MessageRequestDto mensaje = new MessageRequestDto(remitente, destinatario, contenido);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<MessageRequestDto>request = new HttpEntity<>(mensaje, headers);

        String url = "https://localhost:8082/api/mensajes";

        try{
            ResponseEntity<Void> response = restTemplate.postForEntity(url, request, Void.class);

            if(response.getStatusCode().is2xxSuccessful()){
                System.out.println("Mensaje enviado con éxito");
            } else {
                System.out.println("Error al enviar el mensaje: " + response.getStatusCode());
            }

        }catch (Exception e){
            System.out.println("Ocurrio un error al conectar con el sistema de mensajería" + e.getMessage());
        }

    }

}
