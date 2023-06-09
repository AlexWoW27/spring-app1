package ru.course.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.course.spring.config.SpringConfig;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());


        context.close();
    }
}
