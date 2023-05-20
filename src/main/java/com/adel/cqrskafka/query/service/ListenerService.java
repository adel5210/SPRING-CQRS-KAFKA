package com.adel.cqrskafka.query.service;

import com.adel.cqrskafka.entities.model.BaseEvent;
import com.adel.cqrskafka.entities.model.SimpleMessageEvent;
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

    @Transactional
    @KafkaListener(
            id = "${kafka-uptash.topic.consumer}",
            topics = "${kafka-uptash.topic.consumer}"
    )
    public void topicListener(final BaseEvent data) {
        log.info("Receive data {}", data);
    }

}
