import java.util.Scanner;

public class EqualEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());


        for (int k = n; k <= m; k++) {
            String l = "" + k; // concatenate int to int as a String
            int sumEven = 0;
            int sumOdd = 0;
            for (int i = 0; i < l.length(); i++) {
                int currentLetter = Integer.parseInt("" + l.charAt(i));
                if ((i+1)  % 2 == 0) {
                    sumEven += currentLetter;
                } else {
                    sumOdd += currentLetter;
                }
            }
            if (sumEven == sumOdd) {
                System.out.printf("%s ", l);
            }

        }
    }
}
