import java.util.Scanner;

public class ReportSustem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int countSum = 0;
        double payedByCard = 0;
        double payedCash = 0;
        int countCard = 0;
        int countCash = 0;
        int countTrans = 0;


        while (true) {
            if ("End".equals(input)) {
                System.out.println("Failed to collect required money for charity.");
                break;
            }
            int price = Integer.valueOf(input);
            switch (countTrans) {
                case (0):
                    if (price > 100) {
                        System.out.println("Error in transaction!");
                        countTrans++;
                    } else {
                        System.out.println("Product sold!");
                        payedCash += price;
                        countCash++;
                        countTrans++;
                        countSum += price;
                    }
                    break;
                case (1):
                    if (price < 10) {
                        System.out.println("Error in transaction!");
                        countTrans = 0;
                    } else {
                        System.out.println("Product sold!");
                        payedByCard += price;
                        countCard++;
                        countTrans = 0;
                        countSum += price;
                    }
                    break;
            }
            if (countSum < sum) {
                input = scanner.nextLine();
            } else {
                System.out.printf("Average CS: %.2f\nAverage CC: %.2f", payedCash / countCash, payedByCard / countCard);
                break;
            }
        }
    }
}
