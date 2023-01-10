import java.util.Scanner;

public class BeerOrChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beerBottles = Integer.parseInt(scanner.nextLine());
        int chipsPacks = Integer.parseInt(scanner.nextLine());

        double beerPrice = 1.20 * beerBottles;
        double chipsPrise = Math.ceil(chipsPacks * (beerPrice * 0.45));
        double diff = Math.abs(budget - beerPrice - chipsPrise);

        if (budget >= beerPrice + chipsPrise) {
            System.out.printf("%s bought a snack and has %.2f leva left.", name, diff);
        } else {
            System.out.printf("%s needs %.2f more leva!", name, diff);
        }
    }
}
