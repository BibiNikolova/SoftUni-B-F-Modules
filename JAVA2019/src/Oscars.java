import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double startScores = Double.parseDouble(scanner.nextLine());
        int numScorers = Integer.parseInt(scanner.nextLine());
        double totalScore = 0;
        double finalScore = totalScore + startScores;
        for (int i = 0; i < numScorers; i++) {
            String jury = scanner.nextLine();
            int name = jury.length();
            double scoreJury = Double.parseDouble(scanner.nextLine());
            totalScore = ((name * scoreJury) / 2);
            finalScore += totalScore;
            if (finalScore > 1250.5) {
                break;
            }
        }
            if(finalScore < 1250.5){
                System.out.printf("Sorry, %s you need %.1f more!", actor, (1250.5 - finalScore));
            } else {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, finalScore);
            }

        }
    }
