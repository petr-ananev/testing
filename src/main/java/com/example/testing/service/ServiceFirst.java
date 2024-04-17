package com.example.testing.service;

import com.example.testing.model.Model;
import org.springframework.stereotype.Service;

@Service
public class ServiceFirst implements IService<Model> {

    @Override
    public void doSome() {

    }

    @Override
    public Class<Model> getKey() {
        return Model.class;
    }


}
