package com.adel.cqrskafka.ui.view;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@Route("simple-msg")
@PageTitle("Simple Message | CQRS-KAFKA")
public class SimpleMessageView extends VerticalLayout {
    public SimpleMessageView() {

        setSizeFull();
        setAlignItems(Alignment.CENTER);


        add(

        );

    }
}
