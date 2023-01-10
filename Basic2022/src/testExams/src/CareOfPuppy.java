import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int food = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int eaten = 0;
        int foodInGrams = food * 1000;

        while (!"Adopted".equals(input)) {
            int eatenFood = Integer.parseInt(input);
            eaten += eatenFood;
            input = scanner.nextLine();
        }
        if (foodInGrams >= eaten) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGrams - eaten);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(foodInGrams - eaten));
        }
    }
}

