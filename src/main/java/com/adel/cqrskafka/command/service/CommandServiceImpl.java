package com.adel.cqrskafka.command.service;

import com.adel.cqrskafka.entities.model.BaseEvent;
import org.springframework.stereotype.Component;

@Component
public class CommandServiceImpl implements CommandService{
    @Override
    public void push(BaseEvent baseEvent) {

    }
}
