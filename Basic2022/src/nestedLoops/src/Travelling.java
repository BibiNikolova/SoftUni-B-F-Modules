import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            double budget = Double.parseDouble(scanner.nextLine());
            double sumOfSavings = 0;
            while (sumOfSavings < budget) {
                sumOfSavings += Double.parseDouble(scanner.nextLine());
            }
            System.out.printf("Going to %s!\n", input);
            input = scanner.nextLine();
        }
    }
}
