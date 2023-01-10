import java.util.Scanner;

public class Tennis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTournments = Integer.parseInt(scanner.nextLine());
        int startScores = Integer.parseInt(scanner.nextLine());
        double totalScores = 0;
        double finalScores = 0;
        double averagePerTourn = 0;
        double numWinn = 0;

        for (int i = 0; i < numTournments; i++) {
            String tournment = scanner.nextLine();
            switch (tournment) {
                case "W":
                    numWinn += 1;
                    totalScores += 2000;
                    break;
                case "F":
                    totalScores += 1200;
                    break;
                case "SF":
                    totalScores += 720;
                    break;
            }
            finalScores = startScores + totalScores;
            averagePerTourn = Math.floor(totalScores/numTournments);
        }
        System.out.printf("Final points: %.0f\n", finalScores);
        System.out.printf("Average points: %.0f\n", averagePerTourn);
        System.out.printf("%.2f%%", ((numWinn/numTournments) * 100));
    }
}
