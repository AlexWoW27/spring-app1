package ru.course.spring;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{
    @Override
    public String getSong() {
        return "Every breath you take… I'll be watching you";
    }
}
