package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 3 numbers: ");
        for (int i =0; i<3; i++){
            int a = scanner.nextInt();
            sum += a;
        }

        System.out.println("The sum is " + sum);
    }
}
