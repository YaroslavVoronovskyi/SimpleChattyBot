package com.griddynamics.yvoronovskyi.simplechattybot;

public class Main {
    public static final String LINE_SEPARATOR = System.lineSeparator();

    public static void main(String[] args) {
        SimpleBotService bot = new SimpleBotService();
        ConsoleReader reader = new ConsoleReader();

        bot.greet("Aid", "2020");
        String name = reader.scanString("Please, remind me your name.");
        System.out.println("What a great name you have, " + name + "!");

        System.out.println("Let me guess your age. Enter remainders of dividing your age ");
        bot.guessAge(reader.scanInt("by 3"), reader.scanInt("by 5"), reader.scanInt("by 7"));

        bot.count(reader.scanInt("Now I will prove to you that I can count to any number you want."));

        System.out.println("Let's test your programming knowledge." + LINE_SEPARATOR
                + "Why do we use methods?");

        int answer = reader.scanInt("1. To repeat a statement multiple times." + LINE_SEPARATOR
                + "2. To decompose a program into several small subroutines." + LINE_SEPARATOR
                + "3. To determine the execution time of a program." + LINE_SEPARATOR
                + "4. To interrupt the execution of a program.");
        if (answer != 1 && answer != 2 && answer != 3) {
            System.out.println("Answer is nit correct, study more.");
        } else {
            System.out.println("Answer correct! Congratulations!" + LINE_SEPARATOR
                    + "Congratulations, have a nice day!");
        }
    }
}
