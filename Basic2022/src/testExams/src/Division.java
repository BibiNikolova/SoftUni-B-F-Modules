import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (int i = 1; i <= num; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            if (n % 2 == 0) {
                count2++;
            }
            if (n % 3 == 0) {
                count3++;
            }
            if (n % 4 == 0) {
                count4++;
            }
//            n = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("%.2f%%\n", count2 * 1.0 / num * 100);
        System.out.printf("%.2f%%\n", count3 * 1.0 / num * 100);
        System.out.printf("%.2f%%", count4 * 1.0 / num * 100);
    }
}
