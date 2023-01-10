import java.util.Scanner;

public class CelsiusToFarenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = Double.parseDouble(scanner.nextLine());
        double farenheit = 32 + celsius * 1.8000;

        System.out.printf("%.2f", farenheit);
    }
}

