package lessons11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lessonExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;

        boolean correctInput = false;
        do {
            System.out.println("Введите, пожалуйста, два числа: ");
            try {
                a = sc.nextDouble();
                b = sc.nextDouble();
                correctInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод числа.");
                sc.next();
            }
        } while (!correctInput);

        System.out.println("Введите, пожалуйста, знак операции:");
        String c = sc.next();
        System.out.println("Результат вычисления операции " + c + " равен: " + calculate(a, b, c));

    }

    public static double calculate(double a, double b, String c) {
        double result = 0;
        switch (c) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                    result = a / b;
                break;
            default:
                System.out.println("Неизвестный оператор");
        }
        return result;
    }
}

