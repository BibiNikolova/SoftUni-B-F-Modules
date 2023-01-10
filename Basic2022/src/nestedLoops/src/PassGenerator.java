import java.util.Scanner;

public class PassGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        boolean toBreak = false;


        for (char i = '#'; i <= '8'; i++) { // char as a symbol
            for (char j = '@'; j < 'b'; j++) {
                for (int k = 1; k <= a; k++) {
                    for (int l = 1; l <= b; l++) {
                        sum++;
                        if (sum > max) {
                            break;
                        } else {
                            System.out.printf("%s%s%d%d%s%s|", i, j, k, l, j, i);
                            i ++;
                            if (i == '8') {
                                i = '#';
                            }
                            j ++;
                            if (j == 'a') {
                                j = '@';
                            }
                        }
                    }
                    if ((k == a) || (sum > max)) {
                        toBreak = true;
                        break;
                    }
                }
                if (toBreak) {
                    break;
                }
            }
            if (toBreak) {
                break;
            }
        }
    }
}



