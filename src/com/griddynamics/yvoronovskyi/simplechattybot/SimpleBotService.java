package com.griddynamics.yvoronovskyi.simplechattybot;

public class SimpleBotService {
    public static final String LINE_SEPARATOR = System.lineSeparator();

    public void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + "." + LINE_SEPARATOR
                + "I was created in " + birthYear + "." + LINE_SEPARATOR
                + "Please, remind me your name.");
    }

    public void remindName(String name) {
        System.out.println("What a great name you have, " + name + "!");
    }

    public void guessAge(int firstRemainder, int secondRemainder, int thirdRemainder) {
        int age = (firstRemainder * 70 + secondRemainder * 21 + thirdRemainder * 15) % 105;
        System.out.println("Your age is " + age + "; That's a good time to start programming!");
    }

    public void count(int number) {
        for (int index = 0; index <= number; index++) {
            System.out.printf("%d!\n", index);
        }
    }

    public void test(int number) {
        System.out.println("Answer correct! Congratulations!");
    }
}
