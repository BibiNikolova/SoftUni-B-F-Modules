import java.util.Scanner;

public class StrOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String word = "";

        int countC = 0;
        int countO = 0;
        int countN = 0;
        int secretCommand = 0;

        while (!"End".equals(input)) {
            char i = input.charAt(0);
            if ((i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z')) {
                switch (i) {
                    case 'C':
                        if (countC >= 1) {
                            word += i;
                        } else {
                            countC++;
                            secretCommand++;
                        }
                        break;
                    case 'c':
                        if (countC >= 1) {
                            word += i;
                        } else {
                            countC++;
                            secretCommand++;
                        }
                        break;
                    case 'N':
                        if (countN >= 1) {
                            word += i;
                        } else {
                            countN++;
                            secretCommand++;
                        }
                        break;
                    case 'n':
                        if (countN >= 1) {
                            word += i;
                        } else {
                            countN++;
                            secretCommand++;
                        }
                        break;
                    case 'O':
                        if (countO >= 1) {
                            word += i;
                        } else {
                            countO++;
                            secretCommand++;
                        }
                        break;
                    case 'o':
                        if (countO >= 1) {
                            word += i;
                        } else {
                            countO++;
                            secretCommand++;
                        }
                        break;
                    default:
                        word += i;
                        break;
                }
                if (secretCommand == 3) {
                    System.out.printf("%s ", word);
                    countC = 0;
                    countO = 0;
                    countN = 0;
                    secretCommand = 0;
                    word = "";
                }
            }
            input = scanner.nextLine();
        }
    }
}
