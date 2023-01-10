import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        if (!(num == 0 || (num >= 100 && num <= 200))) {
            System.out.println("invalid");
        }
    }
}

