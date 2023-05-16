package com.adel.cqrskafka.command.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ListenerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Transactional
    @KafkaListener(
            id = "K_SIMPLE_TOPIC",
            topics = "K_SIMPLE_TOPIC"
    )
    public void topicListener(final String message) {
        log.info("Receive data {}", message);
    }

}
