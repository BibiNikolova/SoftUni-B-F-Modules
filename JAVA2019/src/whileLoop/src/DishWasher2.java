import java.util.Scanner;

public class DishWasher2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somat = Integer.parseInt(scanner.nextLine()) * 750;
        String input = scanner.nextLine();
        int count = 0;

        int washedDishes = 0;
        int washedPots = 0;
        int leftSomat = 0;

        while (leftSomat < somat) {
            if ("End".equals(input)) {
                break;
            }
            int washDishes = Integer.valueOf(input);
            if (count < 2) {
                washedDishes += washDishes;
                leftSomat += washDishes * 5;
                count++;
            } else {
                washedPots += washDishes;
                leftSomat += washDishes * 15;
                count = 0;
            }
            if (leftSomat < somat) {
                input = scanner.nextLine();
            } else {
                break;
            }
        }
        if (leftSomat > somat) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(leftSomat - somat));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n", washedDishes, washedPots);
            System.out.printf("Leftover detergent %d ml.", Math.abs(leftSomat - somat));
        }
    }
}
