package com.startjava.lesson2.jaeger;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float heigth;
    private float weight;
    private int strength;
    private int armor;

    public boolean drift() {
        return true;
    }

    public void move() {
        System.out.println(getModelName() + " moving.");
    }

    public void scanKaiji() {
        System.out.println(getModelName() + " scaning.");
    }

    public void useVortexCannon() {
        System.out.println(getModelName() + " activated.");
    }

    public Jaeger(String modelName, String mark, String origin, float heigth, float weight, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.heigth = heigth;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }
}

class JaegerTest {
    public static void main(String[] args) {
        String s = "";
        Jaeger bracerphoenix = new Jaeger("Bracer Phoenix", "Mark-5", "USA", 70.91f, 2.128f, 8, 9);
        Jaeger chernoalpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2.412f, 10, 10);
        System.out.println("    Робот Bracer Phoenix:");
        s = bracerphoenix.drift() ? "Да." : "Нет.";
        System.out.println(bracerphoenix.getModelName() + " дрифт: " + s);
        bracerphoenix.move();
        bracerphoenix.scanKaiji();
        bracerphoenix.useVortexCannon();
        System.out.println("    Робот Cherno Alpha:");
        s = chernoalpha.drift() ? "Да." : "Нет.";
        System.out.println(chernoalpha.getModelName() + " дрифт: " + s);
        chernoalpha.move();
        chernoalpha.scanKaiji();
        chernoalpha.useVortexCannon();
    }
}
