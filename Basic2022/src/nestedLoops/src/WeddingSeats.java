import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char sector = input.charAt(0);
        int rawA = Integer.parseInt(scanner.nextLine());
        int oddSeats = Integer.parseInt(scanner.nextLine());

        int allSeats = 0;


        for (char i = 'A'; i <= sector; i++) {
            for (int j = 1; j <= rawA; j++) {
                if (j % 2 == 0) {
                    for (int k = 97; k < oddSeats + 99; k++) {
                        char seat = (char) k;
                        System.out.printf("%s%d%s\n", i, j, seat);
                        allSeats ++;
                    }
                } else if (j % 2 != 0) {
                    for (int k = 97; k < oddSeats + 97; k++) {
                        char seat = (char) k;
                        System.out.printf("%s%d%s\n", i, j, seat);
                        allSeats ++;
                    }
                }
            }
            rawA++;
        }
        System.out.println(allSeats);
    }
}


