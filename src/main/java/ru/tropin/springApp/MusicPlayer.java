package ru.tropin.springApp;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playerMusic() {
        System.out.println("Playing : " + music.getSong());
    }
}
