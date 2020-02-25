package xyz.kail.demo.spring.integration.core;

import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.core.MessagingTemplate;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        final DirectChannel directChannel = new DirectChannel();

        directChannel.subscribe(message -> System.out.println(message.getPayload()));
        directChannel.subscribe(message -> System.out.println(message.getPayload()));
        directChannel.subscribe(message -> System.out.println(message.getPayload()));

        MessagingTemplate messagingTemplate = new MessagingTemplate(directChannel);

        messagingTemplate.send(MessageBuilder.withPayload("123").build());
        messagingTemplate.convertAndSend(Collections.singletonMap("asd", "123"));


    }

}
