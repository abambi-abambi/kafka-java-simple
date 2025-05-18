package org.example.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Producer {
    private final KafkaTemplate<Integer, String> kafkaTemplate;

    public void send(Integer key, String msg) {
        kafkaTemplate.send("mytop", key, msg);
    }

}
