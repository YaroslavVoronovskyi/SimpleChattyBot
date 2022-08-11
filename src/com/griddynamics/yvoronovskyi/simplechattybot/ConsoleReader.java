package com.griddynamics.yvoronovskyi.simplechattybot;

import java.util.Scanner;

public class ConsoleReader {
    public String scanString() {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        if (expression == null || expression.isEmpty()) {
            return ("Expression can not be null or empty, please try again");
        }
        return expression;
    }

    public int scanInt() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            return Integer.parseInt("Reminders can not be less 0");
        }
        return number;
    }
}
