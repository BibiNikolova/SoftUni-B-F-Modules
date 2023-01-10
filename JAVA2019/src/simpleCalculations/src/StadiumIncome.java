import java.util.Scanner;

public class StadiumIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sectors = Integer.parseInt(scanner.nextLine());
        int fullCapacity = Integer.parseInt(scanner.nextLine());
        double ticketPrise = Double.parseDouble(scanner.nextLine());

//
        double incomePerSector = (fullCapacity * ticketPrise) / sectors;
        double totalIncome = incomePerSector * sectors;
        double charity = (totalIncome - (incomePerSector * 0.75))/8;


        System.out.printf("Total income - %.2f BGN%nMoney for charity - %.2f BGN", totalIncome, charity);
    }
}
