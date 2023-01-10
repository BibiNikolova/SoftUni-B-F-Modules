import java.util.Scanner;

public class Easter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            if ("one".equals(input)) {
                second--;
                if (second == 0) {
                    System.out.printf("Player two is out of eggs. Player one has %d eggs left.", first);
                    break;
                }
            } else {
                first--;
                if (first == 0) {
                    System.out.printf("Player one is out of eggs. Player two has %d eggs left.", second);
                    break;
                }
            }
            input = scanner.nextLine();
        }
        if ("End".equals(input)) {
            System.out.printf("Player one has %d eggs left.\nPlayer two has %d eggs left.", first, second);
        }
    }
}
