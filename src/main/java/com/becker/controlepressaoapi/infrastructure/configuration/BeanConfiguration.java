package com.becker.controlepressaoapi.infrastructure.configuration;

import com.becker.controlepressaoapi.domain.adapters.services.ControlePressaoServiceImpl;
import com.becker.controlepressaoapi.domain.ports.interfaces.ControlePressaoServicePort;
import com.becker.controlepressaoapi.domain.ports.repositories.ControlePressaoRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    ControlePressaoServicePort controlePressaoService(ControlePressaoRepositoryPort controlePressaoRepositoryPort) {
        return new ControlePressaoServiceImpl(controlePressaoRepositoryPort);
    }
}
