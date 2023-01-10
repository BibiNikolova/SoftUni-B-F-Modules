import java.util.Scanner;

public class WorldSwimm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeMeter = Double.parseDouble(scanner.nextLine());
        double swimmingTime = distance * timeMeter;
        double delay = Math.floor(distance / 15) * 12.5;
        double totalTime = swimmingTime + delay;

        if (record > totalTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(record - totalTime));

        }

    }
}
