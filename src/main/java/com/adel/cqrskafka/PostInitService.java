package com.adel.cqrskafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Slf4j
@ConditionalOnExpression("${component.post-init:false}")
@Component
public class PostInitService implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("[POST-INIT] initializing...");
    }
}
