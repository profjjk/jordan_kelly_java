package com.company;

public class Calculator {
    public int addInts(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        return result;
    }

    public int subtractInts(int num1, int num2) {
        int result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        return result;
    }

    public int multiplyInts(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        return result;
    }

    public int divideInts(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public double addDoubles(double num1, double num2) {
        double result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        return result;
    }

    public double subtractDoubles(double num1, double num2) {
        double result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        return result;
    }

    public double multiplyDoubles(double num1, double num2) {
        double result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        return result;
    }

    public double divideDoubles(double num1, double num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
