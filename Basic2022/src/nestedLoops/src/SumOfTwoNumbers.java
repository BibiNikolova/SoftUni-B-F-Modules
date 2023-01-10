import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicN = Integer.parseInt(scanner.nextLine());
        int countComb = 0;
        boolean isMagic = false;
        int sum = 0;
        int first = 0;
        int last = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                countComb++;
                first = i;
                last = j;
                sum = i + j;
                if (sum == magicN) {
                    isMagic = true;
                    break;
                }
            }
            if (sum == magicN) {
                isMagic = true;
                break;
            }
        }
        if (isMagic) {
            System.out.printf("Combination N:%d (%d + %d = %d)", countComb, first, last, magicN);
        } else {
            System.out.printf("%d combinations - neither equals %d", countComb, magicN);
        }
    }
}
