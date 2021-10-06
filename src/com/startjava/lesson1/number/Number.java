package com.startjava.lesson1.number;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        boolean guess = false;
        int x = (int) (Math.random() * 100 + 1);
        Scanner sc = new Scanner(System.in);
        while (!guess) {
            System.out.println("Введите число:");
            int number = sc.nextInt();
            if (number > x) {
                System.out.println("Данное число больше того, что загадал компьютер");
            }
            else if (number < x) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
            else if (number == x) {
                System.out.println("Поздравляю, число угадано!");
                guess = true;
            }
        }
        System.out.println("Компьютер загадал число " + x);
    }
}
