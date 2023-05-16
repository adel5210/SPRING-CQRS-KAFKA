package com.adel.cqrskafka.query.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.CompletableFuture;

@Service
@Slf4j
@RequiredArgsConstructor
public class PublisherService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Transactional
    public String publish(final String topic, final String message){
        log.info("Publish to topic {} ...", topic);

        final CompletableFuture<SendResult<String, String>> result = kafkaTemplate.send(topic, message);
        result.thenAccept(r -> log.info("Published successfully"))
                .exceptionally(ex -> {
                    log.error("Fail to published");
                    throw new RuntimeException(ex.getMessage());
                });

        return "Complete";

    }

}
