package com.adel.cqrskafka.ui.service;

import com.adel.cqrskafka.entities.model.SimpleMessageEvent;
import com.adel.cqrskafka.ui.events.SimpleMessageViewEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class SimpleMessagePublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void publish(final SimpleMessageEvent event) {
        log.info("Publish internal event ...");
        applicationEventPublisher.publishEvent(
                new SimpleMessageViewEvent(this, event)
        );
    }

}
