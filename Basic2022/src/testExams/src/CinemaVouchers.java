import java.util.Scanner;

public class CinemaVouchers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voucher = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int tickets = 0;
        int price = 0;
        int others = 0;
        boolean isTicket = true;


        while (!"End".equals(input)) {
            int ascii = input.length();

            if (ascii > 8) {
                price += input.charAt(0) + input.charAt(1);
                isTicket = true;

            } else {
                price += input.charAt(0);
                isTicket = false;

            }
            if (price <= voucher) {
                if (isTicket) {
                    tickets++;
                } else {
                    others++;
                }
            } else {
                break;
            }
            input = scanner.nextLine();
        }
        System.out.println(tickets);
        System.out.println(others);
    }
}
