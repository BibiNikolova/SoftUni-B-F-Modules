import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrise = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        int order = puzzle + dolls + bears + minions + trucks;
        double prise = (puzzle * 2.60 + dolls * 3.0 + bears * 4.10 + minions * 8.20 + trucks * 2.00);
        double profit = 0.0;

        if (order >= 50) {
            double totalPrise = prise * 0.75;
            double rent = totalPrise * 0.10;
            profit = totalPrise - rent;
        } else {
            double rent = prise * 0.10;
            profit = prise - rent;
        }
        if (tripPrise <= profit) {
            System.out.printf("Yes! %.2f lv left.", profit - tripPrise);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(profit - tripPrise));
        }
    }
}
