import java.util.Scanner;

public class WeddingHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lHall = Double.parseDouble(scanner.nextLine());
        double wHall = Double.parseDouble(scanner.nextLine());
        double lBar = Double.parseDouble(scanner.nextLine());

        double freeSpace = ((lHall * wHall) * 0.81 - (lBar * lBar));
        double guests = freeSpace / 3.2;


        System.out.printf("%.0f", Math.ceil(guests));
    }
}
