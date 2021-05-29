package com.company;

import com.company.interfaces.ConverterIf;
import com.company.interfaces.ConverterSwitch;

import java.util.Scanner;

public class ConverterApplication implements ConverterIf, ConverterSwitch {
    private static Scanner scanner = new Scanner(System.in);
    private static ConverterApplication converter = new ConverterApplication();

    public static void main(String[] args) {
        // Testing the ConverterIf methods.
        System.out.println("==== Test ConverterIf Methods ====");

        System.out.print("Select month by entering a number from 1 to 12: ");
        int monthIf = scanner.nextInt();
        String choiceMonthIf = converter.convertMonthIf(monthIf);
        System.out.println("You chose " + choiceMonthIf + ".");

        System.out.print("Select day of week by entering a number from 1 to 7: ");
        int dayIf = scanner.nextInt();
        String choiceDayIf = converter.convertDayIf(dayIf);
        System.out.println("You chose " + choiceDayIf + ".");


        // Testing the ConverterSwitch methods.
        System.out.println("==== Test ConverterSwitch Methods ====");

        System.out.print("Select day of week by entering a number from 1 to 7: ");
        int monthSwitch = scanner.nextInt();
        String choiceMonthSwitch = converter.convertMonthSwitch(monthSwitch);
        System.out.println("You chose " + choiceMonthSwitch + ".");

        System.out.print("Select day of week by entering a number from 1 to 7: ");
        int daySwitch = scanner.nextInt();
        String choiceDaySwitch = converter.convertDaySwitch(daySwitch);
        System.out.println("You chose " + choiceDaySwitch + ".");
    }

    public String convertMonthIf(int monthNumber) {
        if (monthNumber == 1) {
            return "January";
        } else if (monthNumber == 2) {
            return "February";
        } else if (monthNumber == 3) {
            return "March";
        } else if (monthNumber == 4) {
            return "April";
        } else if (monthNumber == 5) {
            return "May";
        } else if (monthNumber == 6) {
            return "June";
        } else if (monthNumber == 7) {
            return "July";
        } else if (monthNumber == 8) {
            return "August";
        } else if (monthNumber == 9) {
            return "September";
        } else if (monthNumber == 10) {
            return "October";
        } else if (monthNumber == 11) {
            return "November";
        } else if (monthNumber == 12) {
            return "December";
        } else {
            System.out.println("Please enter a number from 1-12.");
            return null;
        }
    }

    public String convertDayIf(int dayNumber) {
        if (dayNumber == 1) {
            return "Sunday";
        } else if (dayNumber == 2) {
            return "Monday";
        } else if (dayNumber == 3) {
            return "Tuesday";
        } else if (dayNumber == 4) {
            return "Wednesday";
        } else if (dayNumber == 5) {
            return "Thursday";
        } else if (dayNumber == 6) {
            return "Friday";
        } else if (dayNumber == 7) {
            return "Saturday";
        } else {
            System.out.println("Please enter a number from 1-7.");
            return null;
        }
    }

    public String convertMonthSwitch(int monthNumber) {
        switch(monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                System.out.println("Please enter a number from 1-12");
                break;
        }
        return null;
    }

    public String convertDaySwitch(int dayNumber) {
        switch(dayNumber) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                System.out.println("Please enter a number from 1-7");
                break;
        }
        return null;
    }
}
