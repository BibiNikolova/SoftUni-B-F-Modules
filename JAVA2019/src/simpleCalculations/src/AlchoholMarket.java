import java.util.Scanner;

public class AlchoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double whiskeyPrise = Double.parseDouble(scanner.nextLine());
        double beer = Double.parseDouble(scanner.nextLine());
        double wine = Double.parseDouble(scanner.nextLine());
        double rakia = Double.parseDouble(scanner.nextLine());
        double whiskey = Double.parseDouble(scanner.nextLine());


        double rakiaPrise = whiskeyPrise/2;
        double winePrise = rakiaPrise * 0.6;
        double beerPrise = rakiaPrise * 0.2;
        double sum = (whiskey * whiskeyPrise) + (beer * beerPrise) + (wine * winePrise) + (rakia * rakiaPrise);

        System.out.printf("%.2f",sum);
    }
}
