package ru.tropin.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayerFirst = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayerSecond = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayerFirst.playMusic();
        musicPlayerSecond.playMusic();

        context.close();
    }
}
