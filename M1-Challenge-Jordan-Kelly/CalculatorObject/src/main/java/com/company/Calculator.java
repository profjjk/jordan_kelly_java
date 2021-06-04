package com.company;

public class Calculator {
    public int add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        return result;
    }

    public int subtract(int num1, int num2) {
        int result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        return result;
    }

    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        return result;
    }

    public int divide(int num1, int num2) {
        try {
            int result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
            return result;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public double add(double num1, double num2) {
        double result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        return result;
    }

    public double subtract(double num1, double num2) {
        double result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        return result;
    }

    public double multiply(double num1, double num2) {
        double result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        return result;
    }

    public double divide(double num1, double num2) {
        try {
            double result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
            return result;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
