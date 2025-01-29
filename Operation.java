import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d x %d = %d%n", a, b, a * b);
        if (b != 0) {
            System.out.printf("%d / %d = %.2f%n", a, b, (double) a / b);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        sc.close();
    }
}
