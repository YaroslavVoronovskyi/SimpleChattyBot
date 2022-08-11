package com.griddynamics.yvoronovskyi.simplechattybot;

import java.util.Scanner;

public class ConsoleReader {
    private final static Scanner scanner = new Scanner(System.in);
    public String scanString() {
        String name = scanner.nextLine();
        while (name == null || name.trim().isEmpty()) {
            getErrorName();
            return scanString();
        }
        return name;
    }

    public int scanInt() {
        int number = scanner.nextInt();
        while (number < 0) {
            getErrorNumber();
            return scanInt();
        }
        return number;
    }

    public int scanIntForTestCase() {
        int number = scanner.nextInt();
        while (number <= 0 | number >= 4) {
            getErrorNumberForLastQuestion();
            return scanIntForTestCase();
        }
        return number;
    }

    private void getErrorName() {
        System.out.println("Name can not be null or empty");
    }

    private void getErrorNumber() {
        System.out.println("Reminders can not be less 0");
    }

    private void getErrorNumberForLastQuestion() {
        System.out.println("Please, try again, choose number from 1 to 4");
    }
}
