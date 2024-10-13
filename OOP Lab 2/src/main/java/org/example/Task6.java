package org.example;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of times to write sentence: ");
        int times = scanner.nextInt();
        printText(times);
    }

    public static void printText(int times) {
        for (int i=0; i < times; i++) {
            System.out.println("In the beginning there were the swamp, the hoe and Java.");
        }
    }
}
