import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int treated = 0;
        int untreated = 0;
        int countDays = 1;
        int doctors = 7;


        for (int i = 0; i < days; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (countDays < 3) {
                if (patients <= doctors) {
                    treated += patients;
                } else {
                    treated += doctors;
                    untreated += patients - doctors;
                }
                countDays++;
            } else {
                if (untreated > treated) {
                    doctors++;
                    if (patients <= doctors) {
                    treated += patients;
                    } else {
                    treated += doctors;
                    untreated += patients - doctors;
                    }
                }else {
                    if (patients <= doctors) {
                    treated += patients;
                    } else {
                    treated += doctors;
                    untreated += patients - doctors;
                    }
                }
                countDays = 1;
            }
        }
        System.out.printf("Treated patients: %d.\nUntreated patients: %d.", treated, untreated);
    }
}
