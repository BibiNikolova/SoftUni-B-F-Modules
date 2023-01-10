import java.util.Scanner;

public class Godzilla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothPriceArtist = Double.parseDouble(scanner.nextLine());
        double totalClothPrice = clothPriceArtist * statists;
        double decor = budget * 0.1;
        double discClothPrice = 0.0;
        double projectPrice = 0.0;

        if (statists > 150) {
            discClothPrice = totalClothPrice * 0.9;
            projectPrice = decor + discClothPrice;
        } else {
            discClothPrice = totalClothPrice;
            projectPrice = decor + discClothPrice;
        }
        if ( projectPrice > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget - projectPrice));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - projectPrice);
        }
    }
}


