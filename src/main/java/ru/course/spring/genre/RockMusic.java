package ru.course.spring.genre;

import ru.course.spring.Music;

import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Рок1";
    }
}
