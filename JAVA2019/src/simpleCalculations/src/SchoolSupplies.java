import java.util.Scanner;

public class SchoolSupplies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int penPackages = Integer.parseInt(scanner.nextLine());
        int markerPackages = Integer.parseInt(scanner.nextLine());
        double cleaningDetegrentForBoard = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double orderPrise = (penPackages * 5.80) + (markerPackages * 7.20) + (cleaningDetegrentForBoard * 1.2);
        double discountPrise = orderPrise - ((orderPrise * percentDiscount )/ 100);

        System.out.printf("%.3f", discountPrise);
    }

}
