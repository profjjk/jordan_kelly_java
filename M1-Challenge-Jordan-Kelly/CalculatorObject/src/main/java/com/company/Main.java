package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Calculator calc = new Calculator();

    public static void main(String[] args) {
        System.out.println("==== Test Cases ====");

        calc.add(1, 1);
        calc.subtract(23, 52);
        calc.multiply(34, 2);
        calc.divide(12, 3);
        calc.divide(12, 7);
        calc.add(3.4, 2.3);
        calc.multiply(6.7, 4.4);
        calc.subtract(5.5, 0.5);
        calc.divide(10.8, 2.2);

        System.out.println("\n==== Integer Arithmetic ====");

        System.out.print("Enter an integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter another integer: ");
        int num2 = scanner.nextInt();

        calc.add(num1, num2);
        calc.subtract(num1, num2);
        calc.multiply(num1, num2);
        calc.divide(num1, num2);

        System.out.println("\n==== Double Arithmetic ====");

        System.out.print("Enter a double: ");
        double num3 = scanner.nextDouble();
        System.out.print("Enter another double: ");
        double num4 = scanner.nextDouble();

        calc.add(num3, num4);
        calc.subtract(num3, num4);
        calc.multiply(num3, num4);
        calc.divide(num3, num4);
    }
}
