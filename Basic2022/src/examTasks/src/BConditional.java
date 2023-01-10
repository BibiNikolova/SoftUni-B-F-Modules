import java.util.Scanner;

public class BConditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int absent = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double perDayForFirst = Double.parseDouble(scanner.nextLine());
        double perDayForSecond = Double.parseDouble(scanner.nextLine());
        double perDayForThird = Double.parseDouble(scanner.nextLine());

        double eaten = Math.ceil((perDayForFirst  + perDayForSecond  + perDayForThird) * absent);


        if(food > eaten) {
            System.out.printf("%.0f kilos of food left.", food - eaten);
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.abs(eaten - food));
        }
    }
}
