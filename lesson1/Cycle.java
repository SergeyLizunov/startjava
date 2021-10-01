public class Cycle {
    public static void main(String[] args) {
        // for while
        int number = 6;
        // for do while
        int number1 = 10;
        int s = 0;

        System.out.println("Выведите на консоль с помощью цикла for все числа от [0, 20]");
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)");
        while (number >= -6) {
            System.out.print(number + " ");
            number -= 2;
        }
        System.out.println();
        System.out.println("Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль");
        do {
            if (number1 % 2 != 0) {
                s += number1;
            }
            number1 += 1;
        } while (number1 <= 20);
        System.out.println(s);
    }
}