import java.util.Scanner;

public class TripWithPetya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        int num = puzzle + dolls + bears + minions + trucks;
        double totalPrice = puzzle * 2.60 + dolls * 3.00 + bears * 4.10 + minions * 8.20 + trucks * 2.0;
        double finalPrice = 0.0;


        if(num >= 50){
            double discountPrice = totalPrice * 0.75;
            double rent = discountPrice * 0.1;
            finalPrice = discountPrice - rent;
        } else {
            double rent = totalPrice * 0.1;
            finalPrice = totalPrice - rent;
        }
        if(tripPrice <= finalPrice){
            System.out.printf("Yes! %.2f lv left.", finalPrice - tripPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(tripPrice - finalPrice));
        }
    }
}
