import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b;
        String operation;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the first number: ");
        a = scanner.nextDouble();
        System.out.print("Type the second number: ");
        b = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Type the operation: ");
        operation = scanner.nextLine().trim();
        double result;
        if (operation.equals("+"))
            result = a + b;
        else if (operation.equals("-"))
            result = a - b;
        else if (operation.equals("/"))
            result = a / b;
        else
            result = a * b;
        System.out.println(result);
    }
}