package org.example;

public class Task8 {
    public static void main(String[] args) {
        drawShape(10);
    }

    public static void drawShape(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

