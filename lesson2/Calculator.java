import java.util.Scanner;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char operation;
    private String nextOperation = "yes";

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public char getOperation() {
        return operation;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public String getNextOperation() {
        return nextOperation;
    }

    public void setNextOperation(String nextOperation) {
        this.nextOperation = nextOperation;
    }

    //'+'
    public int addNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    //'-'
    public int subtractNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    //'*'
    public int multiplyNumbers(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    //'/'
    public double divisionNumbers(int firstNumber, int secondNumber) {
        return 1.0 * firstNumber / secondNumber;
    }

    //'^'
    public int powNumbers(int firstNumber, int secondNumber) {
        int p = firstNumber;
        for (int i = 1; i < secondNumber; i++) {
            p *= firstNumber;
        }
        return p;
    }

    //'%'
    public int remDivisionNumbers(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }
}

class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        while(calc.getNextOperation().equals("yes") && !calc.getNextOperation().equals("no")) {
            System.out.print("Введите первое число: ");
            calc.setFirstNumber(sc.nextInt());
            System.out.print("Введите знак математической операции: ");
            calc.setOperation(sc.next().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setSecondNumber(sc.nextInt());
            switch(calc.getOperation()) {
                case '+':
                    System.out.println("Результат выполнения операции: " + calc.addNumbers(calc.getFirstNumber(), calc.getSecondNumber()));
                    break;
                case '-':
                    System.out.println("Результат выполнения операции: " + calc.subtractNumbers(calc.getFirstNumber(), calc.getSecondNumber()));
                    break;
                case '*':
                    System.out.println("Результат выполнения операции: " + calc.multiplyNumbers(calc.getFirstNumber(), calc.getSecondNumber()));
                    break;
                case '/':
                    System.out.println("Результат выполнения операции: " + calc.divisionNumbers(calc.getFirstNumber(), calc.getSecondNumber()));
                    break;
                case '^':
                    System.out.println("Результат выполнения операции: " + calc.powNumbers(calc.getFirstNumber(), calc.getSecondNumber()));
                    break;
                case '%':
                    System.out.println("Результат выполнения операции: " + calc.remDivisionNumbers(calc.getFirstNumber(), calc.getSecondNumber()));
                    break;
                default:
                    System.out.println("Данные введены неверно.");
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            calc.setNextOperation(sc.next());
            while (!calc.getNextOperation().equals("yes") && !calc.getNextOperation().equals("no")) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                calc.setNextOperation(sc.next());
            }
        }
    }
}
