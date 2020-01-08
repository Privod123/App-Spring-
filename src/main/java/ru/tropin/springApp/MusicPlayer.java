package ru.tropin.springApp;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private Music music;

    private String name;
    private int volume;

    public MusicPlayer() {}

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
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

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playerMusic() {
        System.out.println("Playing : " + music.getSong());
    }

    public void playMusicList(){
        for (Music music1 : musicList) {
            System.out.println("Playing : " + music1.getSong());
        }
    }
}
