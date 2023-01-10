import java.util.Scanner;

public class LettersComb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = scanner.nextLine().charAt(0); // char input from scanner
        char end = scanner.nextLine().charAt(0);
        char letter = scanner.next().charAt(0);
        int combinations = 0;

        for (char i = start; i <= end; i++) {
            for (char j = start; j <= end ; j++) {
                for (char k = start; k <= end; k++) {
                    if(i != letter && j != letter && k != letter){
                        combinations ++;
                        System.out.printf("%s%s%s ", i, j, k);
                    }
                }
            }

        }
        System.out.print(combinations);
    }
}

