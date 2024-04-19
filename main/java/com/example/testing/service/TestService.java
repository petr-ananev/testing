package com.example.testing.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class TestService {

    private final Map<Class<IKey>, IService<IKey>> serviceMap;


    public int getMapSize() {
        return serviceMap.values().size();
    }

}
