package com.adel.cqrskafka;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Push;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@Push
@EnableKafka
@EnableAsync

public class MainApplication implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

}
