package com.adel.cqrskafka.ui.view;

import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("login")
public class LoginView extends VerticalLayout {
    public LoginView() {
        var form = new LoginForm();
        form.setAction("login");
        add(form);
    }
}
