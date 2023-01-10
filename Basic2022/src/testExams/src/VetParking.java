import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double totalSum = 0;

        for (int i = 1; i <= days; i++) {
            for (int j = 1; j <= hours; j++) {
                if(i % 2 == 0 && j % 2 !=0) {
                    sum += 2.5;
                } else if (i % 2 != 0 && j % 2 ==0) {
                    sum += 1.25;
                } else {
                    sum += 1.00;
                }
            }
            System.out.printf("Day: %d - %.2f leva\n", i, sum);
            totalSum += sum;
            sum = 0;
        }
        System.out.printf("Total: %.2f leva", totalSum);
    }
}
