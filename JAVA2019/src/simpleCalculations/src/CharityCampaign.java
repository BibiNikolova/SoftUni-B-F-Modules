import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int bakers = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        int cakesProfit = days * cakes * 45;
        double wafflesProfit = days * waffles * 5.80;
        double pancakesProfit = days * pancakes * 3.20;
        double sum = bakers * (cakesProfit + wafflesProfit + pancakesProfit);
        double charity = sum  - (sum/8);

        System.out.printf("%.2f",charity);
    }

}
