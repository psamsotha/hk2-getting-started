package com.demo;

import org.jvnet.hk2.annotations.Service;

import jakarta.inject.Inject;

@Service
public class School {

    private final Teacher teacher;

    @Inject
    public School(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
