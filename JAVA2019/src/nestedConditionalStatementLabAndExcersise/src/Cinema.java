import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String film = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (film.equals("Premiere")) {
            price = 12;
        } else if (film.equals("Normal")) {
            price = 7.5;
        } else if (film.equals("Discount")) {
            price = 5;
        }
        price = r * c * price;
        System.out.printf("%.2f leva.", price);
    }
}
