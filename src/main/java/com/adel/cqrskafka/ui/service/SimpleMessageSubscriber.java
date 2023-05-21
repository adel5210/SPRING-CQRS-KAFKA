package com.adel.cqrskafka.ui.service;

import com.adel.cqrskafka.command.service.PublisherService;
import com.adel.cqrskafka.entities.model.SimpleMessageEvent;
import com.adel.cqrskafka.ui.events.SimpleMessageViewEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class SimpleMessageSubscriber implements ApplicationListener<SimpleMessageViewEvent> {

    private final PublisherService publisherService;

    @Override
    public void onApplicationEvent(SimpleMessageViewEvent event) {
        log.info("Process to external service ...");
        final SimpleMessageEvent sme = event.getEvent();
        publisherService.publish(
                sme.getTopic(),
                sme.getMessage(),
                sme.getOwner()
        );
    }
}

