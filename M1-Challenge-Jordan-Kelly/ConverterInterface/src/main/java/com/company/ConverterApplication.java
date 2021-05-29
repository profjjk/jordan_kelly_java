package com.company;

import java.util.Scanner;

public class ConverterApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static Converter converter = new Converter();

    public static void main(String[] args) {
        System.out.println("==== Test ConverterIf Methods ====");
        System.out.print("Select month by entering a number from 1 to 12: ");
        int month = scanner.nextInt();

        System.out.println("==== Test ConverterSwitch Methods ====");
        System.out.print("Select day of week by entering a number from 1 to 7: ");
    }
}
