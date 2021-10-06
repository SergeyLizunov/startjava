package com.startjava.lesson1.symbol;

public class Symbol {
    public static void main(String[] args) {
        System.out.println("Символы кодировки Unicode в диапазоне [9398, 10178]:");
        for (int i = 9398; i <= 10178; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
        System.out.println("Символы кодировки Unicode в диапазоне [33, 126]:");
        for (int i = 33; i <= 126; i++) {
            System.out.print((char) i + " ");
        }
    }
}