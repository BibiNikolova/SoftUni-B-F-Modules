import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = Integer.parseInt(scanner.nextLine());
        double result = 0;
        double allN = 0;
        int nine = 0;
        int nineteen = 0;
        int twN = 0;
        int thN = 0;
        int fortyN = 0;
        int invalid = 0;
        for (int i = 0; i < steps; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            if (n >= 0 && n <= 9) {
                nine ++;
                result += n * 0.2;
            }else if (n >= 10 && n <= 19) {
                nineteen ++;
                result += n * 0.3;
            } else if (n >= 20 && n <= 29) {
                twN ++;
                result += n * 0.4;
            } else if (n >= 30 && n <= 39) {
                thN ++;
                result += 50;
            } else if (n >= 40 && n <= 50) {
                fortyN ++;
                result += 100;
            } else {
                invalid ++;
                result = result * 0.5;
            }
            allN ++;
        }
        System.out.printf("%.2f\n", result);
        System.out.printf("From 0 to 9: %.2f%%\n", (nine/allN) * 100);
        System.out.printf("From 10 to 19: %.2f%%\n", (nineteen/allN) * 100);
        System.out.printf("From 20 to 29: %.2f%%\n", (twN/allN) * 100);
        System.out.printf("From 30 to 39: %.2f%%\n", (thN/allN) * 100);
        System.out.printf("From 40 to 50: %.2f%%\n", (fortyN/allN) * 100);
        System.out.printf("Invalid numbers: %.2f%%", (invalid/allN) * 100);
    }
}
