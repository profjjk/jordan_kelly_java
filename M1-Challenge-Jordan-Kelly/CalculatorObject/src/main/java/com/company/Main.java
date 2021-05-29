package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Calculator calc = new Calculator();

    public static void main(String[] args) {
        System.out.println("==== Test Cases ====");

        calc.addInts(1, 1);
        calc.subtractInts(23, 52);
        calc.multiplyInts(34, 2);
        calc.divideInts(12, 3);
        calc.divideInts(12, 7);
        calc.addDoubles(3.4, 2.3);
        calc.multiplyDoubles(6.7, 4.4);
        calc.subtractDoubles(5.5, 0.5);
        calc.divideDoubles(10.8, 2.2);

        System.out.println("\n==== Integer Arithmetic ====");

        System.out.print("Enter an integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter another integer: ");
        int num2 = scanner.nextInt();

        calc.addInts(num1, num2);
        calc.subtractInts(num1, num2);
        calc.multiplyInts(num1, num2);
        calc.divideInts(num1, num2);

        System.out.println("\n==== Double Arithmetic ====");

        System.out.print("Enter a double: ");
        double num3 = scanner.nextInt();
        System.out.print("Enter another double: ");
        double num4 = scanner.nextInt();

        calc.addDoubles(num3, num4);
        calc.subtractDoubles(num3, num4);
        calc.multiplyDoubles(num3, num4);
        calc.divideDoubles(num3, num4);
    }
}
