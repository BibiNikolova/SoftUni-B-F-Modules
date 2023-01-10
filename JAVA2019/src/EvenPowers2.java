import java.util.Scanner;

public class EvenPowers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count = 1;

        for (int i = 0; i <= n; i += 2) {
                System.out.println(count);
                count = count * 2 * 2;
            }
        }
    }
