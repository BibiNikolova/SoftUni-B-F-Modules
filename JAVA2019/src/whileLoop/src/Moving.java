import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int space = l * w * h;


        while (space > 0) {
            String input = scanner.nextLine();
            if ("Done".equals(input)) {
                System.out.printf("%d Cubic meters left.", space);
                break;
            }
            int box = Integer.valueOf(input);
            space -= box;
        }
        if (space <= 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.", space = Math.abs(space));
        }
    }
}