package com.example.testing.config;

import com.example.testing.service.IKey;
import com.example.testing.service.IService;
import org.springframework.context.annotation.Bean;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public <K extends IKey> Map<Class<K>, IService<K>> getServiceMap(Set<IService<K>> services) {
        return services.stream().collect(Collectors.toMap(IService::getKey, Function.identity()));
    }

}
