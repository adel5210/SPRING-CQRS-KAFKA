package com.adel.cqrskafka.entities.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class BaseEvent implements Serializable {
    private String id;
    private String topic;
    private final Date timestamp = new Date();
}
