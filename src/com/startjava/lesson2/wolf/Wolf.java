package com.startjava.lesson2.wolf;

public class Wolf {
    private boolean sex;
    private String name;
    private int weight;
    private int age;
    private String color;

    public boolean isSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            //System.out.println("Некорректный возраст.");
            return;
        } else {
            this.age = age;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go() {
        System.out.println(this.name + " идет.");
    }

    public void sit() {
        System.out.println(this.name + " сидит.");
    }

    public void run() {
        System.out.println(this.name + " бежит.");
    }

    public void howl() {
        System.out.println(this.name + " воет.");
    }

    public void hunt() {
        System.out.println(this.name + " охотится.");
    }

}

class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex(true);
        String wolfSex = wolf.isSex() ? "Мужской" : "Женский";
        System.out.println("Пол волка: " + wolfSex + ".");
        wolf.setName("Акелла");
        System.out.println("Кличка волка: " + wolf.getName() + ".");
        wolf.setWeight(90);
        System.out.println("Вес волка: " + wolf.getWeight() + "кг.");
        wolf.setAge(10);
        String wolfAge = wolf.getAge() == 0 ? "Некорректный возраст." : wolf.getAge() + "";
        System.out.println("Возраст волка: " + wolfAge);
        wolf.setColor("Серый");
        System.out.println("Окрас волка: " + wolf.getColor() + ".");
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
