package ru.course.spring;
import org.springframework.beans.factory.annotation.Value;
import java.util.List;
import java.util.Random;



public class MusicPlayer {
    private List<Music> music;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private  int volume;


    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic() {
        Random random = new Random();
        return "Playing: " + music.get(random.nextInt(music.size())).getSong();

    }
}