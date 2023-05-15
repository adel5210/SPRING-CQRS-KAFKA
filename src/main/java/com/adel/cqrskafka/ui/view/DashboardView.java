package com.adel.cqrskafka.ui.view;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@Route("")
@PageTitle("Dashboard | CQRS-KAFKA")
@PermitAll
public class DashboardView extends VerticalLayout {

    public DashboardView(

    ) {
    }
}
