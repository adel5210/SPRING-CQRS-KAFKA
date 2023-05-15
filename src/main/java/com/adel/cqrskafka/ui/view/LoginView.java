package com.adel.cqrskafka.ui.view;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("login")
@PageTitle("Login | CQRS-KAFKA")
public class LoginView extends VerticalLayout {
    public LoginView() {
        setSizeFull();
        setAlignItems(Alignment.CENTER);

        var loginForm = new LoginForm();
        loginForm.setAction("login");
        add(
                new H1("CQRS-KAFKA"),
                loginForm
        );
    }
}
