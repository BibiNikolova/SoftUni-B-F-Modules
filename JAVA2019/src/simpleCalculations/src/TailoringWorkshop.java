import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int table = Integer.parseInt(scanner.nextLine());
        double l = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());

        double sSquare = (l/2 * l/2) ;
        double sCover = (l + 0.60) * (w + 0.60);
        double squarePrise = sSquare * 9 * table;
        double coverPrise = sCover * 7 * table;
        double usdPrise = squarePrise + coverPrise;
        double bgnPrise = usdPrise * 1.85;

        System.out.printf("%.2f USD%n%.2f BGN", usdPrise, bgnPrise);


    }
}
