import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numGroups = Integer.parseInt(scanner.nextLine());

        double musala = 0;
        double monblan = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;
        int sumPeople = 0;

        for (int i = 0; i < numGroups; i++) {
            int numPeople = Integer.parseInt(scanner.nextLine());
            if(numPeople <= 5) {
                musala += numPeople;
            } else if(numPeople > 5 && numPeople <=12) {
                monblan += numPeople;
            } else if(numPeople > 12 && numPeople <=25) {
                kilimandjaro += numPeople;
            } else if(numPeople > 25 && numPeople <=40) {
                k2 += numPeople;
            } else  {
                everest += numPeople;
            }
            sumPeople += numPeople;
        }
        System.out.printf("%.2f%%\n", musala/sumPeople*100);
        System.out.printf("%.2f%%\n", monblan/sumPeople*100);
        System.out.printf("%.2f%%\n", kilimandjaro/sumPeople*100);
        System.out.printf("%.2f%%\n", k2/sumPeople*100);
        System.out.printf("%.2f%%\n", everest/sumPeople*100);
    }
}
