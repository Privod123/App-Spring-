package ru.tropin.springApp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> listRockMusic = new ArrayList<>();

    @Override
    public List<String> getSong() {
        listRockMusic.add("rockMusic1");
        listRockMusic.add("rockMusic2");
        listRockMusic.add("rockMusic3");
        return listRockMusic;
    }
}
