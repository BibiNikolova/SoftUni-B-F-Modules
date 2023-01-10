import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());

        int p1Count = 0;
        int p2Count = 0;
        int p3Count = 0;
        int p4Count = 0;
        int p5Count = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                p1Count++;
            } else if (num >= 200 && num <= 399) {
                p2Count++;
            } else if (num >= 400 && num <= 599) {
                p3Count++;
            } else if (num >= 600 && num <= 799) {
                p4Count++;
            } else if (num >= 800) {
                p5Count++;
            }
        }
        double p1 = (p1Count * 1.0/ n) * 100;
        double p2 = (p2Count * 1.0/ n) * 100;
        double p3 = (p3Count * 1.0/ n) * 100;
        double p4 = (p4Count * 1.0/ n) * 100;
        double p5 = (p5Count * 1.0/ n) * 100;

        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%\n", p3);
        System.out.printf("%.2f%%\n", p4);
        System.out.printf("%.2f%%\n", p5);
    }
}
