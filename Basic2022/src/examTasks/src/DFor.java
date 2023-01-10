import java.util.Scanner;

public class DFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        double averageSum = 0;
        int bad = 0;
        int average = 0;
        int good = 0;
        int excellent = 0;


        for (int i = 0; i < students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            averageSum += grade;
            if (grade >= 2.0 && grade <= 2.99) {
                bad ++;
            } else if (grade >= 3.0 && grade <= 3.99) {
                average ++;
            } else if (grade >= 4.0 && grade <= 4.99) {
                good ++;
            } else {
                excellent ++;
            }

        }
        System.out.printf("Top students: %.2f%%\n", excellent * 1.0 / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", good * 1.0 / students * 100 );
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", average * 1.0 / students * 100 );
        System.out.printf("Fail: %.2f%%\n", bad * 1.0 / students * 100);
        System.out.printf("Average: %.2f", averageSum / students);
    }
}
