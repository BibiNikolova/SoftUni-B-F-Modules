import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < numSum; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
        }
        System.out.println(sum);
    }
}
