package com.demo;

import org.jvnet.hk2.annotations.Service;

@Service
public class Teacher {

    public static final String DEFAULT_NAME = "Mr. Miagi";

    private final String name;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher() {
        this(DEFAULT_NAME);
    }

    public String getName() {
        return name;
    }
}
