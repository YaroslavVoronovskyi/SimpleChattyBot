package com.griddynamics.yvoronovskyi.simplechattybot;

import java.util.Scanner;

public class SimpleBotService {
    public void greet(String assistantName, String birthYear) {
        if (assistantName == null || birthYear == null) {
            throw new IllegalArgumentException("Expression can not be null");
        }
        System.out.println("Hello! My name is " + assistantName + "." + System.lineSeparator()
                + "I was created in " + birthYear + "." + System.lineSeparator()
                + System.lineSeparator() + "Please, remind me your name.");
    }

    public void remindName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name can not be null");
        }
        System.out.println("What a great name you have, " + name + "!");
    }

    public void guessAge(int firstRemainder, int secondRemainder, int thirdRemainder) {
        if (firstRemainder < 0 || secondRemainder < 0 || thirdRemainder < 0) {
            throw new IllegalArgumentException("Reminders can not be less 0");
        }
        int age = (firstRemainder * 70 + secondRemainder * 21 + thirdRemainder * 15) % 105;
        System.out.println("Your age is " + age + "; That's a good time to start programming!");
    }

    public void count(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number can not be less 0");
        }
        for (int index = 0; index <= number; index++) {
            System.out.printf("%d!\n", index);
        }
    }

    public void test(int number) {
        if (number == 1) {
            System.out.println("1. To repeat a statement multiple times.");
        } else if (number == 2) {
            System.out.println("2. To decompose a program into several small subroutines.");
        } else if (number == 3) {
            System.out.println("3. To determine the execution time of a program.");
        } else if (number == 4) {
            System.out.println("4. To interrupt the execution of a program.");
        } else
            System.out.println("Please, try again.");
    }
}
