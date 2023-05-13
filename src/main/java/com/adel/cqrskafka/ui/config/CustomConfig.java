package com.adel.cqrskafka.ui.config;

import com.adel.cqrskafka.entities.model.Credential;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "custom-ui")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomConfig {

    private List<Credential> credentials;

}
