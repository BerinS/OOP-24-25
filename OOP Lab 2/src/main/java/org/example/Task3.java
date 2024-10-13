package org.example;

import java.util.Scanner;

public class Task3 {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float num;
        float sum = 0;
        while(true){
            System.out.println("Enter a number: ");
            num = scanner.nextFloat();
            sum += num;
            if (num == 0){
                System.out.print("The sum is " + sum);
                break;
            }
        }
    }
}
