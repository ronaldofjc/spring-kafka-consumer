package br.com.kafka.consumer.utils;

import br.com.kafka.consumer.domain.Book;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;

@Slf4j
public class MessageDeserializer implements Deserializer<Book> {

    @Override
    public Book deserialize(String topic, byte[] data) {

        Book book = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            book = mapper.readValue(data, Book.class);
        } catch (IOException e) {
            log.error("Error in serialize: " + e);
        }

        return book;
    }
}