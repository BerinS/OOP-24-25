package org.example;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (int)Math.pow(2, i);
        }

        System.out.println("The sum is " +( sum + 1));
    }
}
