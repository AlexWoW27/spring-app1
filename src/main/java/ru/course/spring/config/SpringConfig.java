package ru.course.spring.config;

import org.springframework.context.annotation.*;
import ru.course.spring.*;
import ru.course.spring.genre.ClassicalMusic;
import ru.course.spring.genre.JazzMusic;
import ru.course.spring.genre.RockMusic;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("ru.course.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(rockMusic(),jazzMusic(),classicalMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

    @Bean
    Computer computer(){
        return new Computer(musicPlayer());
    }
}
