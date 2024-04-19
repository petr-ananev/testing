package com.example.testing.service;

public interface IService<K extends IKey> {

    void doSome();

    Class<K> getKey();
}
