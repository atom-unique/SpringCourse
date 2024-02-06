package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Neil Alishev
 */
@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(Genres genres) {
        if (genres == Genres.ROCK) {
            return music1.getSong().get(songNumber());
        }
        if (genres == Genres.CLASSICAL) {
            return music2.getSong().get(songNumber());
        }
        return "";
    }

    private int songNumber() {
        Random random = new Random();
        int max = 2;
        int min = 0;
        return random.nextInt((max - min + 1) + min);
    }
}
