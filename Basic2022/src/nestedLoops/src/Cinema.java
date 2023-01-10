import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        int standard = 0;
        int student = 0;
        int kid = 0;

        while (!"Finish".equals(input)) {
            int free = Integer.parseInt(scanner.nextLine());
            double countI = 0;
            for (int i = 1; i <= free; i++) {
                String type = scanner.nextLine();
                if ("standard".equals(type)) {
                    standard++;
                } else if ("student".equals(type)) {
                    student++;
                } else if ("kid".equals(type)) {
                    kid++;
                } else {
                    break;
                }
                countI++;
            }
            System.out.printf("%s - %.2f%% full.\n", input, countI / free * 100);
            input = scanner.nextLine();

        }

        double finalSum = standard + student + kid;
        System.out.printf("Total tickets: %.0f\n", finalSum);
        System.out.printf("%.2f%% student tickets.\n", student / finalSum * 100);
        System.out.printf("%.2f%% standard tickets.\n", standard / finalSum * 100);
        System.out.printf("%.2f%% kids tickets.", kid / finalSum * 100);
    }
}
