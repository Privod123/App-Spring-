package ru.tropin.springApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayerFirst = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayerSecond = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayerFirst.setVolume(10);

        System.out.println("musicPlayerFirst volume = " + musicPlayerFirst.getVolume());
        System.out.println("musicPlayerSecond volume = " + musicPlayerSecond.getVolume());

        context.close();
    }
}
