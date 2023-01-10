package FSC.src;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tankLenght = Integer.parseInt(scanner.nextLine());// cm
        int tankWidth = Integer.parseInt(scanner.nextLine());
        int tankHight = Integer.parseInt(scanner.nextLine());
        double usedSpace = Double.parseDouble(scanner.nextLine());
        double volume = tankLenght * tankWidth * tankHight * 0.001; //liter
        double waterCapacity = volume * (1-(usedSpace/100));//percent

        System.out.printf("%.3f",waterCapacity);
    }
}
