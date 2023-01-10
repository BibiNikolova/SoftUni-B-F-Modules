import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yearType = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double playing = (((48 - h) * 3.0 / 4) + h + (p * 2.0/3));

            if (yearType.equals("leap")) {
                playing = playing * 1.15;
            } else if (yearType.equals("normal")) {
                playing = playing;
            }
        System.out.printf("%.0f", Math.floor(playing));
    }
}
