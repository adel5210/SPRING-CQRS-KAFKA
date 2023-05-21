package com.adel.cqrskafka.ui.events;

import com.adel.cqrskafka.entities.model.SimpleMessageEvent;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class SimpleMessageViewEvent extends ApplicationEvent {

    @Getter
    private final SimpleMessageEvent event;

    public SimpleMessageViewEvent(Object source, SimpleMessageEvent event) {
        super(source);
        this.event = event;
    }
}
