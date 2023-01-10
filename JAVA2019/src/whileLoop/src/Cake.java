import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());

        int leftPieces = l * w;

        while (leftPieces > 0) {
            String input = scanner.nextLine();
            if ("STOP".equals(input)) {
                System.out.printf("%d pieces are left.", leftPieces);
                break;
            }
            int takenPieces = Integer.valueOf(input);
            leftPieces -= takenPieces;
        }
        if (leftPieces <= 0){
                System.out.printf("No more cake left! You need %d pieces more.", leftPieces = Math.abs(leftPieces));
            }
        }
    }
