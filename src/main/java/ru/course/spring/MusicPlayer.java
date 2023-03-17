package ru.course.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private JazzMusic jazzMusic;
    // Инверсия управления

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.jazzMusic = jazzMusic;
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();

    }
}
