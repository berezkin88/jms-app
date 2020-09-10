package person.birch.jmsapp.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import person.birch.jmsapp.config.JmsConfig;
import person.birch.jmsapp.model.HelloWorldMessage;

import javax.jms.Message;

@Component
public class HelloMessageListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage,
                       @Headers MessageHeaders headers, Message message){

        System.out.println("Got a message");

        System.out.println(helloWorldMessage);

//        throw new RuntimeException("foo");
    }
}
