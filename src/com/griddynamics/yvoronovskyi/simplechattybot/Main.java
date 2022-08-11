package com.griddynamics.yvoronovskyi.simplechattybot;

public class Main {
    public static final String LINE_SEPARATOR = System.lineSeparator();

    public static void main(String[] args) {
        SimpleBotService bot = new SimpleBotService();
        ConsoleReader reader = new ConsoleReader();
        try {
            bot.greet("Aid", "2020");
            bot.remindName(reader.scanString());

            System.out.println("Let me guess your age." + LINE_SEPARATOR
                    + "Enter remainders of dividing your age by 3, 5 and 7.");
            bot.guessAge(reader.scanInt(), reader.scanInt(), reader.scanInt());

            System.out.println("Now I will prove to you that I can count to any number you want.");
            bot.count(reader.scanInt());

            System.out.println("Let's test your programming knowledge." + LINE_SEPARATOR
                    + "Why do we use methods?");

            System.out.println("1. To repeat a statement multiple times." + LINE_SEPARATOR
                    + "2. To decompose a program into several small subroutines." + LINE_SEPARATOR
                    + "3. To determine the execution time of a program." + LINE_SEPARATOR
                    + "4. To interrupt the execution of a program.");

            bot.test(reader.scanIntForTestCase());
            System.out.println("Congratulations, have a nice day!");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        } catch (RuntimeException exception) {
            System.out.println("Please print numbers, let's try again");
        }
    }
}
