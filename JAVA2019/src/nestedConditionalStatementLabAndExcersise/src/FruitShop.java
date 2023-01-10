import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double prise = 0;
        boolean isValidFruit = true;
        boolean isValidDay = true;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            if (word.equals("banana")) {
                prise = 2.50;
            } else if (word.equals("apple")) {
                prise = 1.20;
            } else if (word.equals("orange")) {
                prise = 0.85;
            } else if (word.equals("grapefruit")) {
                prise = 1.45;
            }else if (word.equals("kiwi")) {
                prise = 2.70;
            } else if (word.equals("pineapple")) {
                prise = 5.50;
            } else if (word.equals("grapes")) {
                prise = 3.85;
            } else {
                isValidFruit = false;
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (word.equals("banana")) {
                prise = 2.70;
            } else if (word.equals("apple")) {
                prise = 1.25;
            } else if (word.equals("orange")) {
                prise = 0.90;
            } else if (word.equals("grapefruit")) {
                prise = 1.60;
            }else if (word.equals("kiwi")) {
                prise = 3.00;
            } else if (word.equals("pineapple")) {
                prise = 5.60;
            } else if (word.equals("grapes")) {
                prise = 4.20;
            } else {
                isValidFruit = false;
            }
        } else {
            isValidDay = false;
        }
        if (!isValidDay || !isValidFruit) {
            System.out.println("error");
        } else {
            prise = prise * quantity;
            System.out.printf("%.2f", prise);
        }

    }
}
