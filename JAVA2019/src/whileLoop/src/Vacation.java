import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney =Double.parseDouble(scanner.nextLine());
        double income = Double.parseDouble(scanner.nextLine());
        int spendCount = 0;
        int days = 0;
        boolean isSpend = false;

        while (income < neededMoney) {
            String input = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            days ++;
            switch (input) {
                case "spend":
                    spendCount ++;
                    income -= money;
                    if(income < 0) {
                        income = 0;
                    }
                    break;
                case "save":
                    income += money;
                    spendCount = 0;
                    break;
                }
                if(spendCount == 5) {
                isSpend = true;
                break;
            }
        }
        if(isSpend) {
            System.out.printf("You can't save the money.\n%d", days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }

    }
}
