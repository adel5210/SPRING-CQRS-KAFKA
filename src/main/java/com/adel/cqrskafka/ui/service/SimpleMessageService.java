package com.adel.cqrskafka.ui.service;

import com.adel.cqrskafka.entities.model.SimpleMessageEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
@RequiredArgsConstructor
@Slf4j
public class SimpleMessageService {

    private static Collection<Pair<UI, VerticalLayout>> sessionComponent;
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

    private final SimpleMessagePublisher simpleMessagePublisher;

    @Getter
    @Setter
    @Value("${kafka-uptash.topic.producer}")
    public String topic;

    private Collection<Pair<UI, VerticalLayout>> getSessionComponent() {
        if (null != sessionComponent) return sessionComponent;

        synchronized (this) {
            if (null != sessionComponent) return sessionComponent;

            sessionComponent = new CopyOnWriteArrayList<>();
            return sessionComponent;
        }
    }


    public void add(final UI ui, final VerticalLayout vl) {
        getSessionComponent().add(Pair.of(ui, vl));
    }

    public void remove(final UI ui) {
        getSessionComponent().remove(
                getSessionComponent().stream()
                        .filter(f -> f.getLeft().equals(ui))
                        .findFirst()
                        .orElse(null)
        );
    }

    public void onSubmit(final String message, final String owner) {
        simpleMessagePublisher.publish(
                new SimpleMessageEvent(
                        UUID.randomUUID().toString(),
                        topic,
                        "simple message view",
                        message,
                        owner
                )
        );
        getSessionComponent().forEach(sc ->
                sc.getLeft().access(() -> {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(LocalDateTime.now().format(dateTimeFormatter)).append(" ");
                            sb.append(owner).append(": ").append(message);
                            sc.getRight().add(new Label(sb.toString()));
                        }
                ));
    }


}
