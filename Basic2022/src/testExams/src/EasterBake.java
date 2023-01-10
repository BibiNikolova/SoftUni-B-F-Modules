import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String word = scanner.nextLine();
        int points = 0;
        boolean vowel = false;
        int max = Integer.MIN_VALUE;
        String winner = "";


        while (!"End of words".equals(word)) {
            int l = word.length();
            for (int i = 0; i < l; i++) {
                char w = word.charAt(i);
                points += w;
                if (i == 0 && (w == 'A' || w == 'O' || w == 'I' || w == 'E' || w == 'U' || w == 'Y' || w == 'a' || w == 'o'|| w == 'e' || w == 'u' || w == 'y' || w == 'i')) {
                    vowel = true;
                }
            }
            if (vowel == true) {
                points *= l;
            } else {
                points /= l;
            }
            if (points > max) {
                max = points ;
                winner = word;
            }
            word = scanner.nextLine();
            points = 0;

        }
        System.out.printf("The most powerful word is %s - %d", winner, max);

    }
}













