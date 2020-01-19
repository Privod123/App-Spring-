package ru.tropin.springApp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicMusic implements Music {

    private List<String> listClassicMusic = new ArrayList<>();

    private ClassicMusic() {
    }

    @Override
    public List<String> getSong() {
        listClassicMusic.add("classicalMusic1");
        listClassicMusic.add("classicalMusic2");
        listClassicMusic.add("classicalMusic3");
        return listClassicMusic;
    }

    public void doMyInit(){
        System.out.println("start init method class ClassicMusic");
    }

    public void doMyDestroy(){
        System.out.println("start destroy method class ClassicMusic");
    }

    public static ClassicMusic getClassicMusic(){
        System.out.println("used factory-method class ClassicMusic");
        return new ClassicMusic();
    }
}
