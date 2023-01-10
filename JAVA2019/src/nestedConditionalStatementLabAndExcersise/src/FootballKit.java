import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double shirt = Double.parseDouble(scanner.nextLine());
        double neededSum =Double.parseDouble(scanner.nextLine());
        double shorts = shirt * 0.75;
        double socks = shorts * 0.2;
        double boots = (shirt + shorts) * 2;
        double bill = (shirt + shorts + socks + boots) *0.85;

        if (bill >= neededSum){
            System.out.printf("Yes, he will earn the world-cup replica ball!\n" +
                    "His sum is %.2f lv.", bill);
        }else {
            System.out.printf("No, he will not earn the world-cup replica ball.\n" +
                    "He needs %.2f lv. more.", Math.abs(bill - neededSum));
        }
    }
}
