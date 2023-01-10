import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        double min = Double.MAX_VALUE;
        double max = Double. MIN_VALUE;
        double totalRating = 0;
        String topRated = "";
        String lowRated = "";

        for (int i = 0; i < num; i++) {
            String film = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            if (rating > max) {
                max = rating;
                topRated = film;
            } else if (rating < min) {
                min = rating;
                lowRated = film;
            }
            totalRating += rating;
        }
        System.out.printf("%s is with highest rating: %.1f\n", topRated, max);
        System.out.printf("%s is with lowest rating: %.1f\n", lowRated, min);
        System.out.printf("Average rating: %.1f", totalRating / num);
    }
}
