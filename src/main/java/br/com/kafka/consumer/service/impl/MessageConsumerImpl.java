package br.com.kafka.consumer.service.impl;

import br.com.kafka.consumer.domain.Book;
import br.com.kafka.consumer.service.MessageConsumer;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MessageConsumerImpl implements MessageConsumer {

    private static final String TOPIC = "message.topic";

    @Override
    @KafkaListener(topics = TOPIC)
    public void messageListener(ConsumerRecord<String, Book> consumerRecord, Acknowledgment ack) {

        String key = consumerRecord.key();
        Book value = consumerRecord.value();
        int partition = consumerRecord.partition();

        log.info("Message consumed. Book : {}, with key : {} from partition : {}", value, key, partition);

        ack.acknowledge();
    }
}
