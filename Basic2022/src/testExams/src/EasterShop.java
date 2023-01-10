import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggs = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int left = eggs;
        int bought = 0;

        while (!"Close".equals(input)) {
            int addEggs = Integer.parseInt(scanner.nextLine());
            if ("Fill".equals(input)) {
                left += addEggs;
            } else {
                if (addEggs <= left) {
                    left -= addEggs;
                    bought += addEggs;
                } else {
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.", left);
                    break;
                }
            }
            input = scanner.nextLine();
        }
        if ("Close".equals(input)) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", bought);

        }
    }
}

