import java.util.Scanner;

public class ThreeBrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double brother1 = Double.parseDouble(scanner.nextLine());
        double brother2 = Double.parseDouble(scanner.nextLine());
        double brother3 = Double.parseDouble(scanner.nextLine());
        double father = Double.parseDouble(scanner.nextLine());
        double cleaningTimeSum = 1 / (1/brother1 + 1/brother2 + 1/brother3);
        double totalCleaningTime = cleaningTimeSum * 1.15;
        double restTime = father - totalCleaningTime;

        if (restTime >= 0) {
            System.out.printf("Cleaning time: %.2f%n", totalCleaningTime);
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", Math.floor(restTime));
        } else {
            System.out.printf("Cleaning time: %.2f%n", totalCleaningTime);
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", Math.ceil(Math.abs(restTime)));
        }
    }
}




