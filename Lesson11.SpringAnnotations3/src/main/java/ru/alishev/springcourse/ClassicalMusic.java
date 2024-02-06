package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class ClassicalMusic implements Music {

    @Override
    public List<String> getSong() {
        List<String> classicalSongs = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            classicalSongs.add("classical song " + i);
        }
        return classicalSongs;
    }
}
