import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double swimmingTimePerMeter = Double.parseDouble(scanner.nextLine());
        double swimmingTime = distance * swimmingTimePerMeter;
        double delay = Math.floor(distance / 15) * 12.5;
        double totalSwimmingTime = swimmingTime + delay;

        if (record > totalSwimmingTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalSwimmingTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(record - totalSwimmingTime));
        }
    }
}
