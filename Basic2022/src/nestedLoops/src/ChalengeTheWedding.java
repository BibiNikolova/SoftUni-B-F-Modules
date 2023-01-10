import java.util.Scanner;

public class ChalengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int table = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                System.out.printf("(%d <-> %d) ", i, j);
                table--;
                if (table == 0) {
                    break;
                }
            }
            if (table == 0) {
                break;
            }
        }
    }
}


