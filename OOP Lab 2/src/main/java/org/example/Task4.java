package org.example;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter num1: ");
        num1 =  scanner.nextInt();
        System.out.print("Enter num2: ");
        num2 = scanner.nextInt();

        int i = num1;
        System.out.print("Numbers between " + num1 + " and " + num2 + ": ");
        while(i != (num2 + 1)){
            System.out.print(i + " ");
            i++;
        }
    }
}
