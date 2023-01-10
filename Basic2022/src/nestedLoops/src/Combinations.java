import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.next());
        int countN = 0;
        int total = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n ; k++) {
                    total = i + j + k;
                 if(total == n) {
                     countN ++;
                 } else  {
                     total = 0;
                 }

                }
            }
        }
        System.out.println(countN);
    }
}
