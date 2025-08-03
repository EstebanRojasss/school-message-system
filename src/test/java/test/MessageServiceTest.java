package test;

import com.message_api.service.MessageService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

@ExtendWith(MockitoExtension.class)
public class MessageServiceTest {

    @Mock
    RestTemplate restTemplate;

    @InjectMocks
    MessageService messageService;


    @Test
    void enviarMensaje_DeberiaEnviarMensaje(){}

}
