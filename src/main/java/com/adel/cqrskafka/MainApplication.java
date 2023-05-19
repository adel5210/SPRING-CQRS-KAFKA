package com.adel.cqrskafka;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Push;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@Push
@Slf4j
@EnableKafka
@EnableAsync
public class MainApplication implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

}
