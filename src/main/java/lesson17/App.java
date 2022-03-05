package lesson17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate calc = new Calculate();
        double firstNumber = 0;
        double secondNumber = 0;

        boolean correctInput = false;
        do {
            System.out.println("Введите, пожалуйста, два числа: ");
            try {
                firstNumber = sc.nextDouble();
                secondNumber = sc.nextDouble();
                correctInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод числа.");
                sc.next();
            }
        } while (!correctInput);

        System.out.println("Введите, пожалуйста, знак операции:");
        String operator = sc.next();
        calc.printResult(calc.toCalculate(firstNumber,secondNumber,operator));

    }
}
