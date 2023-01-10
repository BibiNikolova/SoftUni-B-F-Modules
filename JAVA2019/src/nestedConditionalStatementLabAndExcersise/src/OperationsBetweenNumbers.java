import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        String evenOdd = "";
        int result = 0;
        double result1 = 0;

        switch (operation) {
            case "+": {
                result = n1 + n2;
                if (result % 2 == 0) {
                    evenOdd = "even";
                } else {
                    evenOdd = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", n1, operation, n2, result, evenOdd);
                break;
            }
            case "-": {
                result = n1 - n2;

                if (result % 2 == 0) {
                    evenOdd = "even";
                } else {
                    evenOdd = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", n1, operation, n2, result, evenOdd);
                break;
            }
            case "*": {
                result = n1 * n2;
                if (result % 2 == 0) {
                    evenOdd = "even";
                } else {
                    evenOdd = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", n1, operation, n2, result, evenOdd);
                break;
            }
            case "/": {
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result1 = n1 * 1.0 / n2;
                    System.out.printf("%d %s %d = %.2f", n1, operation, n2, result1);
                }
                break;
            }
            case "%": {
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 % n2;
                    System.out.printf("%d %s %d = %d",n1, operation,n2, result);
                }
                break;
            }
        }
    }
}

