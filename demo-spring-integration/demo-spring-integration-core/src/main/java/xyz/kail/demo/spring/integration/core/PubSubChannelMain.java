package xyz.kail.demo.spring.integration.core;

import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.messaging.support.MessageBuilder;

public class PubSubChannelMain {

    public static void main(String[] args) {

        SubscribableChannel messageChannel = new PublishSubscribeChannel();

        messageChannel.subscribe(msg -> System.out.println("receive1: " + msg.getPayload()));
        messageChannel.subscribe(msg -> System.out.println("receive2: " + msg.getPayload()));

        messageChannel.send(MessageBuilder.withPayload("msg from alibaba 1").build());
        messageChannel.send(MessageBuilder.withPayload("msg from alibaba 2").build());


    }

}
