import java.util.Scanner;

public class PrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int prime = 0;
        int notPrime = 0;

        while (!"stop".equals(input)) {
            int num = Integer.parseInt(input);
            if (num < 0) {
                System.out.println("Number is negative.");
            } else {
                boolean isPrime = false;
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    } else if (num == 2) {
                        prime += 2;
                    } else {
                        isPrime = true;
                    }
                }
                if (isPrime) {
                    prime += num;
                } else {
                    notPrime += num;
                }

            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", prime);
        System.out.printf("Sum of all non prime numbers is: %d", notPrime);

    }
}
