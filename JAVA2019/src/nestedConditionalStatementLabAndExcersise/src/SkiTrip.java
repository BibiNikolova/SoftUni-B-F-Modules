import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String mark = scanner.nextLine();
        double price = 0;

        switch (room) {
            case "room for one person": {
                price = (--days * 18);
                break;
            }
            case "apartment": {
                if (days < 10) {
                    price = (--days * 25) * 0.7;
                } else if (days >= 10 && days <= 15) {
                    price = (--days * 25) * 0.65;
                } else if (days > 15) {
                    price = (--days * 25) * 0.5;
                }
                break;
            }case "president apartment": {
                if (days < 10) {
                    price = (--days * 35) * 0.9;
                } else if (days >= 10 && days <= 15) {
                    price = (--days * 35) * 0.85;
                } else if (days > 15) {
                    price = (--days * 35) * 0.8;
                }
                break;
            }
        }
        if (mark. equals("positive")) {
            price = price * 1.25;
        } else if (mark.equals("negative")) {
            price = price * 0.9;
        }
        System.out.printf("%.2f", price);
    }
}
