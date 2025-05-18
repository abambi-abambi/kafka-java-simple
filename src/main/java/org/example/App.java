package org.example;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.example.config.ConsumerConfig;
import org.example.config.ProducerKafkaConfig;
import org.example.kafka.Listener;
import org.example.kafka.Producer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws InterruptedException {
        System.out.println( "Hello World!" );

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ConsumerConfig.class, ProducerKafkaConfig.class, Listener.class, Producer.class);

        Producer producer = context.getBean(Producer.class);

        producer.send(1, "Hello from Spring Kafka");

        Thread.sleep(1000_000);
    }
}
