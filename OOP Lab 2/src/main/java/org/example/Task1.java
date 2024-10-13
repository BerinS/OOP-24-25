package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
            String password = "Hello";
            Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password");
            String input = scanner.nextLine();

            while (!input.equals(password)){
                System.out.println("Enter password");
                input = scanner.nextLine();

                if(input.equals(password)){
                    System.out.println("Right!!!");
                    System.out.println("The secret is lol");
                }
            }
        if(input.equals(password)){
            System.out.println("Right!!!");
            System.out.println("The secret is lol");
        }
    }
}
