package ru.tropin.springApp;

public class ClassicMusic implements Music {

    private ClassicMusic() {
    }

    @Override
    public String getSong() {
        return "Лунная соната";
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
