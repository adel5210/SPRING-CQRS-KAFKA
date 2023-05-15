package com.adel.cqrskafka.entities.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public class SimpleMessageEvent extends BaseEvent {

    private final String title;
    private final String message;

    public SimpleMessageEvent(String id, String topic, String title, String message) {
        super(id, topic);
        this.title = title;
        this.message = message;
    }
}
