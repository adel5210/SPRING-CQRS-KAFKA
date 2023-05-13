package com.adel.cqrskafka.ui.config;

import com.adel.cqrskafka.ui.view.LoginView;
import com.vaadin.flow.spring.security.VaadinWebSecurity;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

import java.util.Set;
import java.util.stream.Collectors;

@Configuration
@RequiredArgsConstructor
public class SecurityConfig extends VaadinWebSecurity {

    private final CustomConfig customConfig;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
        setLoginView(http, LoginView.class);
    }

    @Bean
    public UserDetailsManager userDetailsManager(){
        var users = customConfig.getCredentials().stream()
                .map(m -> User.builder()
                        .username(m.getUsername())
                        .password(m.getPassword())
                        .roles(m.getRole())
                        .build())
                .collect(Collectors.toList());
        return new InMemoryUserDetailsManager(users);
    }

}
