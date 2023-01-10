import java.util.Scanner;

public class SecretDoor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= a ; i+=2) {
            for (int j = 2; j <= b ; j++) {
                if (j % j == 0) {
                }
                for (int k = 2; k <= c ; k+=2) {
                    System.out.printf("%d%d%d\n", i,j,k);
                }
            }


        }
    }
}
