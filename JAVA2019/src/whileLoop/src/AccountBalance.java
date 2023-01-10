import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double total = 0;

        while (!"NoMoreMoney".equals(input)) {
            double sum = Double.valueOf(input);
            if (sum > 0) {
                System.out.printf("Increase: %.2f%n", sum);
            } else {
                System.out.println("Invalid operation!");
                break;
            }
            total += sum;
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", total);
    }
}









