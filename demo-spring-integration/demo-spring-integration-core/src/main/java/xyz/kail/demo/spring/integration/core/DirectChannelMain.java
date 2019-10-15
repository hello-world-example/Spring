package xyz.kail.demo.spring.integration.core;

import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.messaging.support.MessageBuilder;

public class DirectChannelMain {

    public static void main(String[] args) {
        // 构造一个可订阅的消息通道 messageChannel
        SubscribableChannel messageChannel = new DirectChannel();
        // 使用 MessageHandler 去消费这个消息通道里的消息
        messageChannel.subscribe(msg -> System.out.println("receive: " + msg.getPayload()));
        // 发送一条消息到这个消息通道，消息最终被消息通道里的 MessageHandler 所消费
        messageChannel.send(MessageBuilder.withPayload("msg from alibaba").build());

        /*
         * 单播
         */
        messageChannel.subscribe(msg -> System.out.println("receive1: " + msg.getPayload()));
        messageChannel.subscribe(msg -> System.out.println("receive2: " + msg.getPayload()));


        messageChannel.send(MessageBuilder.withPayload("msg from alibaba").build());
        messageChannel.send(MessageBuilder.withPayload("msg from alibaba").build());
        messageChannel.send(MessageBuilder.withPayload("msg from alibaba").build());
        messageChannel.send(MessageBuilder.withPayload("msg from alibaba").build());
        messageChannel.send(MessageBuilder.withPayload("msg from alibaba").build());
        messageChannel.send(MessageBuilder.withPayload("msg from alibaba").build());

    }

}
