import java.util.Scanner;

public class TripToWorldCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceDeparture = Double.parseDouble(scanner.nextLine());
        double priceArrival = Double.parseDouble(scanner.nextLine());
        double pricePerMatch = Double.parseDouble(scanner.nextLine());
        int countMatches = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double totalSumFlights = 6 *(priceArrival + priceDeparture) * (100 - discount) / 100;
        double totalSumTickets = 6 * pricePerMatch * countMatches;
        double total = totalSumFlights + totalSumTickets;

        System.out.printf("Total sum: %.2f lv.%n", total);
        System.out.printf("Each friend has to pay %.2f lv.", total / 6);
    }
}

