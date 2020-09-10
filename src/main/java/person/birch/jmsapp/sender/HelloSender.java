package person.birch.jmsapp.sender;

import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import person.birch.jmsapp.config.JmsConfig;
import person.birch.jmsapp.model.HelloWorldMessage;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class HelloSender {

    private final JmsTemplate jmsTemplate;

    @Scheduled(fixedRate = 2000)
    public void sendMessage() {
        System.out.println("Sending message");

        HelloWorldMessage message = HelloWorldMessage
            .builder()
            .id(UUID.randomUUID())
            .message("Hello World!")
            .build();

        jmsTemplate.convertAndSend(JmsConfig.MY_QUEUE, message);

        System.out.println("Message sent");
    }
}
