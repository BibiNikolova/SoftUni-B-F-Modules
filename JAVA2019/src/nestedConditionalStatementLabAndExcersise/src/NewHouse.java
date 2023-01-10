import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double pricePerFlower = 0;

        if (flowers.equals("Roses")) {
            if (numberOfFlowers <= 80) {
                pricePerFlower = 5;
            } else {
                pricePerFlower = 5 * 0.9;
            }
        } else if (flowers.equals("Dahlias")) {
            if (numberOfFlowers <= 90) {
                pricePerFlower = 3.80;
            } else {
                pricePerFlower = 3.80 * 0.85;
            }
        } else if (flowers.equals("Tulips")) {
            if (numberOfFlowers <= 80) {
                pricePerFlower = 2.80;
            } else {
                pricePerFlower = 2.80 * 0.85;
            }
        } else if (flowers.equals("Narcissus")) {
            if (numberOfFlowers >= 120) {
                pricePerFlower = 3.00;
            } else {
                pricePerFlower = 3.00 * 1.15;
            }
        } else if (flowers.equals("Gladiolus")) {
            if (numberOfFlowers >= 80) {
                pricePerFlower = 2.50;
            } else {
                pricePerFlower = 2.50 * 1.20;
            }
        }



/*        switch (flowers) {
            case "Roses": {
                if (numberOfFlowers <= 80) {
                    pricePerFlower = 5;
                } else {
                    pricePerFlower = 5 * 0.9;
                }
                break;
            }
            case "Dahlias": {
                if (numberOfFlowers <= 90) {
                    pricePerFlower = 3.80;
                } else {
                    pricePerFlower = 3.80 * 0.85;
                }
                break;
            }
            case "Tulips": {
                if (numberOfFlowers <= 80) {
                    pricePerFlower = 2.80;
                } else {
                    pricePerFlower = 2.80 * 0.85;
                }
                break;
            }
            case "Narcissus": {
                if (numberOfFlowers >= 120) {
                    pricePerFlower = 3.00;
                } else {
                    pricePerFlower = 3.00 * 1.15;
                }
                break;
            }
            case "Gladiolus": {
                if (numberOfFlowers >= 80) {
                    pricePerFlower = 2.50;
                } else {
                    pricePerFlower = 2.50 * 1.20;
                }
                break;
           }
        }

 */
        double price = numberOfFlowers * pricePerFlower;
        if (price <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowers, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(price - budget));
        }
    }
}
