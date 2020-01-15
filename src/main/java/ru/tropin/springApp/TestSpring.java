package ru.tropin.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music musicRock = context.getBean("rockMusic",Music.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(musicRock);
        musicPlayer1.playMusic();

        Music musicClassic = context.getBean("classicMusic",Music.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(musicClassic);
        musicPlayer2.playMusic();

        context.close();
    }
}