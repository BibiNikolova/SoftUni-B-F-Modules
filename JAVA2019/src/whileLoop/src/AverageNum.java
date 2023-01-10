import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int num1 = Integer.parseInt(scanner.nextLine());
        int countN = 0;
        double sumN = 0.00;


        while (num != 0) {
            sumN += num1;
            countN++;
            if (countN < num) {
                num1 = Integer.parseInt(scanner.nextLine());
            } else {
                System.out.printf("%.2f", sumN / num);
                break;
            }
        }
    }
}
