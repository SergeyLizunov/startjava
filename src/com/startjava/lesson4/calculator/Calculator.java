package com.startjava.lesson4.calculator;

import java.util.Scanner;

public class Calculator {
    private String nextOperation = "yes";

    public String getNextOperation() {
        return nextOperation;
    }

    public void setNextOperation(String nextOperation) {
        this.nextOperation = nextOperation;
    }

    // split string and calculate
    public String readOperation(String s) {
        String[] x = s.split(" ");
        String out = "";
        if(!x[0].contains(".") && !x[2].contains(".")) {
            int a = Integer.parseInt(x[0]);
            int b = Integer.parseInt(x[2]);
            out = calculate(a, x[1], b);
        }
        else if(!x[0].contains(".") && x[2].contains(".")) {
            int a = Integer.parseInt(x[0]);
            double b = Double.parseDouble(x[2]);
            out = calculate(a, x[1], b);
        }
        else if(x[0].contains(".") && !x[2].contains(".")) {
            double a = Double.parseDouble(x[0]);
            int b = Integer.parseInt(x[2]);
            out = calculate(a, x[1], b);
        }
        else if(x[0].contains(".") && x[2].contains(".")) {
            double a = Double.parseDouble(x[0]);
            double b = Double.parseDouble(x[2]);
            out = calculate(a, x[1], b);
        }
        return out;
    }

    // int and int
    public String calculate(int a, String s, int b) {
        String c = "";
        switch(s) {
            case("+"):
                c = String.valueOf(a + b);
                break;
            case("-"):
                c = String.valueOf(a - b);
                break;
            case("*"):
                c = String.valueOf(a * b);
                break;
            case("/"):
                if(b != 0) {
                    c = (1.0 * a / b) + "";
                }
                else {
                    c = "На ноль делить нельзя.";
                }
                break;
            case("^"):
                c = String.valueOf((int) Math.pow(a, b));
                break;
            case("%"):
                c = String.valueOf(a % b);
                break;
        }
        return c;
    }

    // int and double
    public String calculate(int a, String s, double b) {
        String c = "";
        switch(s) {
            case("+"):
                c = (a + b) + "";
                break;
            case("-"):
                c = (a - b) + "";
                break;
            case("*"):
                c = (a * b) + "";
                break;
            case("/"):
                if(b != 0.0) {
                    c = (1.0 * a / b) + "";
                }
                else {
                    c = "На ноль делить нельзя.";
                }
                break;
            case("^"):
                c = Math.pow(a, b) + "";
                break;
            case("%"):
                c = (a % b) + "";
                break;
        }
        return c;
    }

    // double and int
    public String calculate(double a, String s, int b) {
        String c = "";
        switch(s) {
            case("+"):
                c = (a + b) + "";
                break;
            case("-"):
                c = (a - b) + "";
                break;
            case("*"):
                c = (a * b) + "";
                break;
            case("/"):
                if(b != 0) {
                    c = (1.0 * a / b) + "";
                }
                else {
                    c = "На ноль делить нельзя.";
                }
                break;
            case("^"):
                c = Math.pow(a, b) + "";
                break;
            case("%"):
                c = (a % b) + "";
                break;
        }
        return c;
    }

    // double and double
    public String calculate(double a, String s, double b) {
        String c = "";
        switch(s) {
            case("+"):
                c = (a + b) + "";
                break;
            case("-"):
                c = (a - b) + "";
                break;
            case("*"):
                c = (a * b) + "";
                break;
            case("/"):
                if(b != 0.0) {
                    c = (1.0 * a / b) + "";
                }
                else {
                    c = "На ноль делить нельзя.";
                }
                break;
            case("^"):
                c = Math.pow(a, b) + "";
                break;
            case("%"):
                c = (a % b) + "";
                break;
        }
        return c;
    }
}

class CalculatorTest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Калькулятор начал работу. Пример ввода: 10 + 5.3.");
        Calculator calculator = new Calculator();
        System.out.print("Введите математическое выражение: ");
        String s = sc.nextLine();
        System.out.println(calculator.readOperation(s));
        System.out.print("Хотите продолжить вычисления? [yes/no]: ");
        String sNext = sc.nextLine();
        while(!sNext.equals("yes") && !sNext.equals("no")) {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            sNext = sc.nextLine();
        }
        if(sNext.equals("no")) {
            System.out.println("Калькулятор закончил работу.");
            calculator.setNextOperation("no");
        }
        else {
            while(calculator.getNextOperation().equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                s = sc.nextLine();
                System.out.println(calculator.readOperation(s));
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                sNext = sc.nextLine();
                while(!sNext.equals("yes") && !sNext.equals("no")) {
                    System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                    sNext = sc.nextLine();
                }
                if(sNext.equals("no")) {
                    System.out.println("Калькулятор закончил работу.");
                    calculator.setNextOperation("no");
                }
            }
        }
    }
}
