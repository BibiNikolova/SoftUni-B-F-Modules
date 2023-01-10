import java.util.Scanner;

public class TrainTheTrainer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        double totalSum = 0;
        int count = 0;

        while (!"Finish".equals(name)) {
            count ++;
            double average = 0;
            for (int i = 0; i < n; i++) {
                double marks = Double.parseDouble(scanner.nextLine());
                average += marks;
            }
            average /= n;
            totalSum += average;
            System.out.printf("%s - %.2f.\n", name, average);
            name = scanner.nextLine();

        }
        System.out.printf("Student's final assessment is %.2f.", totalSum / count);
    }
}
