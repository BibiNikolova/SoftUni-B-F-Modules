import java.util.Scanner;

public class EWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int days = 1;
        int reached = 5364;
        int end = 8848;

        while (!"END".equals(input) || (reached >= end) || (days >= 5)) {
            int climbed = Integer.parseInt(scanner.nextLine());
            reached += climbed;
//            if ((reached >= end) || (days >= 5)) {
//                break;
//            }
            if ("Yes".equals(input)) {
                days++;
            }

            input = scanner.nextLine();
        }
        if (reached >= end) {
            System.out.printf("Goal reached for %d days!", days);
        } else {
            System.out.println("Failed!");
            System.out.printf("%d", reached);
        }
    }
}
