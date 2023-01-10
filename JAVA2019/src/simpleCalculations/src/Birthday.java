import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percent  = Double.parseDouble(scanner.nextLine());

        int v = l * w * h;
        double vInLiters = v * 0.001;
        double vPercent = percent * 0.01;
        double result = vInLiters * (1 - vPercent);

        System.out.printf("%.3f", result);
        }

    }

