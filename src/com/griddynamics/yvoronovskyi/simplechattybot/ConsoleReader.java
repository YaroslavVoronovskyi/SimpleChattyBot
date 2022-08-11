package com.griddynamics.yvoronovskyi.simplechattybot;

import java.awt.image.ImagingOpException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {
    private final static Scanner scanner = new Scanner(System.in);

    public String scanString(String message) {
        System.out.println(message);
        String name = scanner.nextLine();
        while (name == null || name.trim().isEmpty()) {
            System.out.println("Name can not be null or empty");
            System.out.println(message);
            name = scanner.nextLine();
        }
        return name;
    }

    public int scanInt(String message) {
        int number = 0;
        boolean resultNotValid = false;
        do {
            if (resultNotValid) {
                System.out.println("Please enter correct positive number");
            }
            System.out.println(message);
            try {
                String result = scanner.nextLine();
                number = Integer.parseInt(result);
                resultNotValid = number < 0;
            } catch (NumberFormatException e) {
                resultNotValid = true;
            }
        } while (resultNotValid);
        return number;
    }
}
