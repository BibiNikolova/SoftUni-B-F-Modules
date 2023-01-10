import java.util.Scanner;

public class NumSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if(num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.printf("Max number: %d\nMin number: %d", max, min);
    }
}
