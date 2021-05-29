package com.company;

import java.util.Scanner;

public class ConverterApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static ConverterIf converter1 = new ConverterIf();
    private static ConverterSwitch converter2 = new ConverterSwitch();

    public static void main(String[] args) {
        // Using the ConverterIf methods.
        System.out.println("==== Use ConverterIf Methods ====");

        System.out.print("Select month by entering a number from 1 to 12: ");
        int monthIf = scanner.nextInt();
        String choiceMonthIf = converter1.convertMonth(monthIf);
        System.out.println("You chose " + choiceMonthIf + ".");

        System.out.print("Select day of week by entering a number from 1 to 7: ");
        int dayIf = scanner.nextInt();
        String choiceDayIf = converter1.convertDay(dayIf);
        System.out.println("You chose " + choiceDayIf + ".");


        // Using the ConverterSwitch methods.
        System.out.println("==== Use ConverterSwitch Methods ====");

        System.out.print("Select month by entering a number from 1 to 12: ");
        int monthSwitch = scanner.nextInt();
        String choiceMonthSwitch = converter2.convertMonth(monthSwitch);
        System.out.println("You chose " + choiceMonthSwitch + ".");

        System.out.print("Select day of week by entering a number from 1 to 7: ");
        int daySwitch = scanner.nextInt();
        String choiceDaySwitch = converter2.convertDay(daySwitch);
        System.out.println("You chose " + choiceDaySwitch + ".");
    }
}
