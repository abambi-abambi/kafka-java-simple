package org.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {
//    @KafkaListener(id = "${kafka.id.listen1}", topics = "${kafka.topic.test1}")
    @KafkaListener(id = "listen1", topics = "mytop")
    public void listen(String message) {
        System.out.println("Listened: " + message);
    }
}
