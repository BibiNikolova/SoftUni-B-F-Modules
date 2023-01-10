import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        double bill = videocards * 250 + processors * 0.35 * (videocards * 250) + ram * 0.10 * (videocards * 250);
        double discontBill = 0.0;

        if(videocards > processors){
            discontBill = bill * 0.85;
        } else {
            discontBill = bill;
        }
        if(budget >= discontBill){
            System.out.printf("You have %.2f leva left!", budget - discontBill);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - discontBill));
        }

    }
}
