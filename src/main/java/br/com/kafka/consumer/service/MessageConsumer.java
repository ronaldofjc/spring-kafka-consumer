package br.com.kafka.consumer.service;

import br.com.kafka.consumer.domain.Book;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.support.Acknowledgment;

public interface MessageConsumer {
    void messageListener(ConsumerRecord<String, Book> consumerRecord, Acknowledgment ack);
}
