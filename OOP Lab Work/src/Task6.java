import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Number 2: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        }
        else if (num2 > num1) {
            System.out.println(num2 + " is greater");
        }
        else {
            System.out.println("Equal");
        }

        scanner.close();
    }
}
