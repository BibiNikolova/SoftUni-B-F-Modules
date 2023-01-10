import java.util.Scanner;

public class ExcellentMark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mark = Double.parseDouble(scanner.nextLine());
        if (mark >= 5.5) {
            System.out.println("Excellent!");
        }
    }
}
