package ru.tropin.springApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static ru.tropin.springApp.TypeMusic.CLASSICAL;
import static ru.tropin.springApp.TypeMusic.ROCK;

@Component
public class MusicPlayer {
//    @Autowired                         // данная аннтотация говорит в этом месте сделать иньекцию бина
//    @Qualifier("classicMusic")         // данная аннотация говорит какой именно бин надо вставить
    private Music music1;
    private Music music2;

    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier ("classicMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void doMyInit(){
        System.out.println("start init method class MusicPlayer");
    }

    public void doMyDestroy(){
        System.out.println("start destroy method class MusicPlayer");
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


    public void playMusic(Enum typeMusic) {
        Random random = new Random();
        if (typeMusic == CLASSICAL) {
            int numberMusic = random.nextInt(music1.getSong().size());
            System.out.println(music1.getSong().get(numberMusic));
        } else if (typeMusic == ROCK) {
            int numberMusic = random.nextInt(music2.getSong().size());
            System.out.println(music2.getSong().get(numberMusic));
        } else {
            System.out.println("не известный тип музыки");
        }


    }

}
