package com.adel.cqrskafka.entities.model;

import lombok.*;

@Getter
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class SimpleMessageEvent extends BaseEvent {

    private String title;
    private String message;

    public SimpleMessageEvent(String id, String topic, String title, String message) {
        super(id, topic);
        this.title = title;
        this.message = message;
    }
}
