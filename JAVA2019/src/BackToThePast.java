import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double heritage = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());
        double spentMoney = 0;
        double leftMoney = 0;
        int currentAge = 0;

        for (int i = 1800; i <= yearToLive; i++) {
            if (i % 2 == 0) {
                spentMoney += 12000;
            } else {
                spentMoney += 12000 + 50 * (currentAge + 18);
            }
            currentAge++;
        }
        leftMoney = heritage - spentMoney;
        if (leftMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", leftMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(leftMoney));
        }
    }
}
