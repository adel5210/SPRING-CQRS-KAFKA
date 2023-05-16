package com.adel.cqrskafka.query.controller;

import com.adel.cqrskafka.query.service.PublisherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/query")
@RequiredArgsConstructor
@Slf4j
public class QueryController {

    private final PublisherService publisherService;

    @Value("${kafka-uptash.topic.producer}")
    public String topic;

    @PostMapping
    public String queryMessage(@RequestParam("data") final String data){
        log.info("Query request data {}", data);
        return publisherService.publish(topic, data);
    }

}
