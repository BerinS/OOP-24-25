import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("Positive");
        }
        else if (number == 0) {
            System.out.println("The number is zero.");
        }
        else {
            System.out.println("Negative");
        }
    }
}
