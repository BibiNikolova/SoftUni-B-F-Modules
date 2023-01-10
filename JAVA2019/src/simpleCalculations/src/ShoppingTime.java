import java.util.Scanner;

public class ShoppingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeOut = Integer.parseInt(scanner.nextLine());
        double piecePrise = Double.parseDouble(scanner.nextLine());
        double programPrise = Double.parseDouble(scanner.nextLine());
        double frappePrise = Double.parseDouble(scanner.nextLine());

        int relaxTime = ((timeOut - 5) - (2 * 3) - (2 * 2));
        double totalSpentMoney = (frappePrise + (piecePrise * 3) + (programPrise * 2));

        System.out.printf("%.2f%n%d",totalSpentMoney, relaxTime);
    }
}
