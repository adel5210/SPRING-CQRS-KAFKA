package com.adel.cqrskafka.command.service;

import com.adel.cqrskafka.entities.model.BaseEvent;

public interface CommandService {

    void push(BaseEvent baseEvent);

}
