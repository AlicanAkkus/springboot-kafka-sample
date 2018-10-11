package com.caysever.kafkaconsumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class KafkaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerApplication.class, args);
    }
}

@Service
class KafkaMessageConsumer {

    @KafkaListener(topics = "trip-TRIP_STARTED")
    public void consume(ConsumerRecord<String, String> record) {
        System.out.println(record.value());
    }
}
