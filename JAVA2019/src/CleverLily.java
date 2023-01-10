import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWash = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;
        double saved = 0;
        int countToys = 0;

        for (int i = 1; i <= age ; i++) {

            if(i % 2 == 0 && i == 2) {
                saved += 10;
                totalSum += saved;
            } else if(i % 2 == 0 && i != 2) {
                saved += 10;
                totalSum += saved;
            } else {
                countToys ++;
                totalSum += priceToy;
           }
        }
        totalSum -= age - countToys;
        if (totalSum >= priceWash) {
            System.out.printf("Yes! %.2f", totalSum - priceWash);
        } else {
            System.out.printf("No! %.2f", Math.abs(totalSum - priceWash) );
        }


    }
}
