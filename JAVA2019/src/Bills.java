import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double sumE = 0;
        double water = 0;
        double internet = 0;
        double others = 0;

        for (int i = 0; i < months; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());

                water += 20;
                internet += 15;
                others += (electricity + 20 + 15) * 1.2;
                sumE += electricity;
        }
            double total = sumE + water + internet + others;
            System.out.printf("Electricity: %.2f lv\n", sumE);
            System.out.printf("Water: %.2f lv\n", water);
            System.out.printf("Internet: %.2f lv\n", internet);
            System.out.printf("Other: %.2f lv\n", others);
            System.out.printf("Average: %.2f lv\n", total/months);

        }

    }
