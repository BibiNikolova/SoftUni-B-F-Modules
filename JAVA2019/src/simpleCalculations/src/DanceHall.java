import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double wardrobeLenght = Double.parseDouble(scanner.nextLine());

        double sHall = (l * w) * 10000;
        double sWardrobe = (wardrobeLenght * wardrobeLenght) * 10000;
        double sBench = sHall/10;
        double sDancer = 7040;
        double sFreeHall = sHall - sWardrobe - sBench;
        double numberOfDancers = sFreeHall/sDancer;

        System.out.printf("%.0f", Math.floor(numberOfDancers));

    }
}
