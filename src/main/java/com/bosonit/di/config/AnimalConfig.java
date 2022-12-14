package com.bosonit.di.config;

import com.bosonit.di.registry.ServiceRegistry;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfig {

    @Bean
    public FactoryBean<?> factoryBean() {

        final ServiceLocatorFactoryBean serviceLocatorFactoryBean = new ServiceLocatorFactoryBean();

        serviceLocatorFactoryBean
                .setServiceLocatorInterface(ServiceRegistry.class);
        return serviceLocatorFactoryBean;
    }
}
