import java.util.Scanner;

public class Calculator {
    // for pow
    public static int mypow(int a, int b) {
        int p = a;
        for (int i = 1; i < b; i++) {
            p *= a;
        }
        return p;
    }
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        char operation;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        firstNumber = sc.nextInt();
        System.out.println("Введите второе число:");
        secondNumber = sc.nextInt();
        System.out.println("Введите знак математической операции:");
        operation = sc.next().charAt(0);
        System.out.println("Первое число: " + firstNumber);
        System.out.println("Второе число: " + secondNumber);
        if (operation == '+') {
            System.out.println("Результат выполнения операции: " + (firstNumber + secondNumber));
        }
        else if (operation == '-') {
            System.out.println("Результат выполнения операции: " + (firstNumber - secondNumber));
        }
        else if (operation == '*') {
            System.out.println("Результат выполнения операции: " + (firstNumber * secondNumber));
        }
        else if (operation == '/') {
            System.out.println("Результат выполнения операции: " + (1.0 * firstNumber / secondNumber));
        }
        else if (operation == '^') {
            System.out.println("Результат выполнения операции: " + mypow(firstNumber, secondNumber));
        }
        else if (operation == '%') {
            System.out.println("Результат выполнения операции: " + (firstNumber % secondNumber));
        }
    }
}