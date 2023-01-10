import java.io.InterruptedIOException;
import java.util.Scanner;

public class ASimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fat = Integer.parseInt(scanner.nextLine());
        int protein = Integer.parseInt(scanner.nextLine());
        int carbohydrate = Integer.parseInt(scanner.nextLine());
        int allCalories = Integer.parseInt(scanner.nextLine());
        double water = Double.parseDouble(scanner.nextLine());



        double grFat = (fat * allCalories / 100.0) / 9;
        double grProtein = (protein * allCalories / 100.0) / 4;
        double grCarbo = (carbohydrate * allCalories / 100.0) / 4;
        double allFood = grCarbo + grFat + grProtein;
        double callPerGr = allCalories/allFood;
        double calories = callPerGr * (100 - water) / 100;



        System.out.printf("%.4f", calories);
    }
}
