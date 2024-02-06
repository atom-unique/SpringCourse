package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class RockMusic implements Music {

    @Override
    public List<String> getSong() {
        List<String> rockSongs = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            rockSongs.add("rock song " + i);
        }
        return rockSongs;
    }
}
