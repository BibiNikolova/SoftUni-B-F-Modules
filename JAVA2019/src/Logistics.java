import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLoad = Integer.parseInt(scanner.nextLine());

        int totalWeight = 0;
        double totalPrice = 0;
        double busWeight = 0;
        double truckWeight = 0;
        double trainWeigth = 0;

        for (int i = 0; i < numLoad; i++) {
            int weight = Integer.parseInt(scanner.nextLine());
            if(weight <= 3) {
                busWeight += weight;
            } else if (weight > 3 && weight <= 11) {
                truckWeight += weight;
            } else {
                trainWeigth += weight;
            }
            totalWeight += weight;
        }
        double averagePrice = ((busWeight * 200) + (truckWeight * 175) + (trainWeigth * 120))/totalWeight;
        System.out.printf("%.2f\n", averagePrice);
        System.out.printf("%.2f%%\n", busWeight/totalWeight * 100);
        System.out.printf("%.2f%%\n", truckWeight/totalWeight * 100);
        System.out.printf("%.2f%%", trainWeigth/totalWeight * 100);
    }
}
