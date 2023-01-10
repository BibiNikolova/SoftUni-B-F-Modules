import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine().toLowerCase();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0;

        if (city.equals("sofia")){
            if (sales >= 0 && sales <= 500) {
                commission = 5;
            } else if (500 < sales && sales <= 1000) {
                commission = 7;
            } else if (1000 < sales && sales <= 10000) {
                commission = 8;
            } else if (sales > 10000) {
                commission = 12;
            }
        } else if (city.equals("varna")) {
            if (sales >= 0 && sales <= 500) {
                commission = 4.5;
            } else if (500 < sales && sales <= 1000) {
                commission = 7.5;
            } else if (1000 < sales && sales <= 10000) {
                commission = 10;
            } else if (sales > 10000) {
                commission = 13;
            }
        } else if (city.equals("plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                commission = 5.5;
            } else if (500 < sales && sales <= 1000) {
                commission = 8;
            } else if (1000 < sales && sales <= 10000) {
                commission = 12;
            } else if (sales > 10000) {
                commission = 14.5;
            }
        }
        commission = commission * sales / 100;
        if (commission > 0) {
            System.out.printf("%.2f", commission);
        } else {
            System.out.println("error");
        }
    }
}


