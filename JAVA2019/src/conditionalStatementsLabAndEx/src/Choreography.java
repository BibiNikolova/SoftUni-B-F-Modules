import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps  = Integer.parseInt(scanner.nextLine());
        int dancers = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        double stepsPerDay = (Math.ceil((steps * 1.0 / days) / steps * 100.0));
        double stepsPerDancer = stepsPerDay / dancers;
        char percent = '%';

        if(stepsPerDay <= 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%c.", stepsPerDancer, percent);
        }
        else{
            System.out.printf("No, they will not succeed in that goal! Required %.2f%c steps to be learned per day.", stepsPerDancer, percent);
        }
    }
}
