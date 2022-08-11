package com.griddynamics.yvoronovskyi.simplechattybot;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SimpleBotService bot = new SimpleBotService();
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                bot.greet("Aid", "2020");

                String name = scanner.nextLine();
                bot.remindName(name);

                System.out.println("Let me guess your age." + System.lineSeparator()
                        + "Enter remainders of dividing your age by 3, 5 and 7.");
                int firstRemainder = scanner.nextInt();
                int secondRemainder = scanner.nextInt();
                int thirdRemainder = scanner.nextInt();
                bot.guessAge(firstRemainder, secondRemainder, thirdRemainder);

                System.out.println("Now I will prove to you that I can count to any number you want.");
                int numberForCount = scanner.nextInt();
                bot.count(numberForCount);

                System.out.println("Let's test your programming knowledge." + System.lineSeparator()
                        + "Why do we use methods?");

                System.out.println("1. To repeat a statement multiple times.");
                System.out.println("2. To decompose a program into several small subroutines.");
                System.out.println("3. To determine the execution time of a program.");
                System.out.println("4. To interrupt the execution of a program.");

                int numberForTest = scanner.nextInt();
                bot.test(numberForTest);

                System.out.println("Congratulations, have a nice day!");
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            } catch (RuntimeException exception) {
                System.out.println("Please print numbers, let's try again");
            }
        }
    }
}
