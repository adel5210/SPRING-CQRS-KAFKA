package com.adel.cqrskafka.ui.view;

import com.adel.cqrskafka.ui.service.SimpleMessageService;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.DetachEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("sm")
@PageTitle("Simple Message | CQRS-KAFKA")
public class SimpleMessageView extends VerticalLayout {

    private final SimpleMessageService simpleMessageService;
    private final VerticalLayout broadcastLayout;

    public SimpleMessageView(
            SimpleMessageService simpleMessageService) {

        this.simpleMessageService = simpleMessageService;
        this.broadcastLayout = new VerticalLayout();

        setSizeFull();
        setAlignItems(Alignment.CENTER);

        var title = new H1("Simple message");
        var owner = new TextField();
        var message = new TextField();
        var submitButton = new Button("Submit");

        submitButton.addClickListener(clickEvent -> {
            this.simpleMessageService.onSubmit(
                    message.getValue(),
                    owner.getValue()
            );
        });

        var scroller = new Scroller(
            new Div(this.broadcastLayout)
        );
        scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);
        scroller.getStyle()
                .set("border-bottom", "1px solid var(--lumo-contrast-20pct)")
                .set("padding","var(--lumo-space-m)");

        add(
                title,
                new HorizontalLayout(new Label("Owner  "), owner),
                new HorizontalLayout(new Label("Message"), message),
                submitButton,
                scroller
        );

    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        super.onAttach(attachEvent);
        getUI().ifPresent(ui -> this.simpleMessageService.add(ui, broadcastLayout));
    }

    @Override
    protected void onDetach(DetachEvent detachEvent) {
        super.onDetach(detachEvent);
        getUI().ifPresent(this.simpleMessageService::remove);
    }
}
