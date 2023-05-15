package com.adel.cqrskafka.entities.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public abstract class BaseEvent {
    private final String id;
    private final String topic;
    private final Date timestamp = new Date();
}
