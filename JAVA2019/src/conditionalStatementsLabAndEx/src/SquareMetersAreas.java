import java.util.Scanner;

public class SquareMetersAreas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        double area = 0.0;

        switch (type){
            case "square":
                double a = Double.parseDouble(scanner.nextLine());
                area = a * a;
                break;
            case "rectangle":
                double b = Double.parseDouble(scanner.nextLine());
                double c = Double.parseDouble(scanner.nextLine());
                area = c * b;
                break;
            case "circle":
                double d = Double.parseDouble(scanner.nextLine());
                area = d * d * Math.PI;
                break;
            case "triangle":
                double e = Double.parseDouble(scanner.nextLine());
                double hE = Double.parseDouble(scanner.nextLine());
                area = (e * hE)/2;
                break;
        } System.out.printf("%.3f", area);

    }
}
