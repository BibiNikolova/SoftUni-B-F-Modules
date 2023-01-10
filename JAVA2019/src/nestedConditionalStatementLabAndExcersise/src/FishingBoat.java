import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberOfFishermen = Integer.parseInt(scanner.nextLine());
        double rent = 0;

        switch (season) {
            case "Spring": {
                if (numberOfFishermen <= 6) {
                    rent = 3000 * 0.9;
                } else if (numberOfFishermen > 6 && numberOfFishermen <= 11) {
                    rent = 3000 * 0.85;
                } else if (numberOfFishermen > 11) {
                    rent = 3000 * 0.75;
                }
                break;
            }
            case "Summer": {
                if (numberOfFishermen <= 6) {
                    rent = 4200 * 0.9;
                } else if (numberOfFishermen > 6 && numberOfFishermen <= 11) {
                    rent = 4200 * 0.85;
                } else if (numberOfFishermen > 11) {
                    rent = 4200 * 0.75;
                }
                break;
            }
            case "Autumn": {
                if (numberOfFishermen <= 6) {
                    rent = 4200 * 0.9;
                } else if (numberOfFishermen > 6 && numberOfFishermen <= 11) {
                    rent = 4200 * 0.85;
                } else if (numberOfFishermen > 11) {
                    rent = 4200 * 0.75;
                }
                break;
            }
            case "Winter": {
                if (numberOfFishermen <= 6) {
                    rent = 2600 * 0.9;
                } else if (numberOfFishermen > 6 && numberOfFishermen <= 11) {
                    rent = 2600 * 0.85;
                } else if (numberOfFishermen > 11) {
                    rent = 2600 * 0.75;
                }
                break;
            }
        }
        if (numberOfFishermen % 2 == 0 && (!season.equals("Autumn"))) {
            rent *= 0.95;
        }
        if (rent <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - rent);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(rent - budget));

        }
    }
}

