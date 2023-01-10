import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceInStudio = 0;
        double priceInApartment = 0;

        if (month.equals("May") || month.equals("October")) {
            if (nights > 7 && nights <= 14) {
                priceInStudio = 50 * nights * 0.95;
                priceInApartment = 65 * nights;
            } else if (nights > 14) {
                priceInStudio = 50 * nights * 0.7;
                priceInApartment = 65 * nights * 0.90;
            } else {
                priceInStudio = 50 * nights;
                priceInApartment = 65 * nights;
            }
        } else if (month.equals("June") || month.equals("September")) {
            if (nights > 14) {
                priceInStudio = 75.2 * nights * 0.8;
                priceInApartment = 68.70 * nights * 0.90;
            } else {
                priceInStudio = 75.2 * nights;
                priceInApartment = 68.70 * nights;
            }
        } else if (month.equals("July") || month.equals("August")) {
            if (nights > 14) {
                priceInApartment = 77 * nights * 0.90;
                priceInStudio = 76 * nights;
            } else {
                priceInApartment = 77 * nights;
                priceInStudio = 76 * nights;
            }
        }
        System.out.printf("Apartment: %.2f lv.%n", priceInApartment);
        System.out.printf("Studio: %.2f lv.", priceInStudio);
    }
}
