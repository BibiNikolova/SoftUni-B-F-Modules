import java.util.Scanner;

public class CNestedCond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();


        double benefit = 0;

        switch (place) {
            case "Bulgaria" :
                benefit = points * dancers;
                if ("summer".equals(season)) {
                    benefit *= 0.95;
                } else if ("winter".equals(season)){
                    benefit *= 0.92;
                }
                break;
            case "Abroad":
                benefit = points * dancers * 1.5;
                if ("summer".equals(season)) {
                    benefit *= 0.9;
                } else if ("winter".equals(season)){
                    benefit *= 0.85;
                }
                break;
        }

        double charity = benefit * 0.75;
        double sumPerDancer = (benefit - charity) / dancers;

        System.out.printf("Charity - %.2f\n", charity);
        System.out.printf("Money per dancer - %.2f", sumPerDancer);
    }
}
