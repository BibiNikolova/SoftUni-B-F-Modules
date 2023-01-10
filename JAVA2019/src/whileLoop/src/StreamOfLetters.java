import java.util.Locale;
import java.util.Scanner;

public class StreamOfLetters {
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
                    case ('c'):

                        //                        countC++;
                                //                        secretCommand += countC;
                                    //                        if (countC > 1) {
                                    //                            word += 'c';
                                        //                            secretCommand -= countC;
//                        }
                        break;
                    case ('C'):
                        countC++;
                        secretCommand += countC;
                        if (countC > 1) {
                            word += 'C';
                            secretCommand -= countC;
                        }
                        break;
                    case ('n'):
                        countN++;
                        secretCommand += countN;
                        if (countN > 1) {
                            word += 'n';
                            secretCommand -= countN;
                        }
                        break;
                    case ('N'):
                        countN++;
                        secretCommand += countN;
                        if (countN > 1) {
                            word += 'N';
                            secretCommand -= countN;
                        }
                        break;
                    case ('o'):
                        countO++;
                        secretCommand += countO;
                        if (countO > 1) {
                            word += 'o';
                            secretCommand -= countO;
                        }
                        break;
                    case ('O'):
                        countO++;
                        secretCommand += countO;
                        if (countO > 1) {
                            word += 'O';
                            secretCommand -= countO;
                        }
                        break;
                    default:
                        word += i;
                        break;
                }
            }
            if (secretCommand == 3) {
                System.out.printf("%s ", word);
                countC = 0;
                countN = 0;
                countO = 0;
                secretCommand = 0;
                word = "";
            }
            input = scanner.nextLine();
        }
    }
}




