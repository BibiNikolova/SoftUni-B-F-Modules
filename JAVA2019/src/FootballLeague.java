import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadium = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        double countA = 0;
        double countB = 0;
        double countV = 0;
        double countG = 0;
        double percentage = fans * 1.0 / stadium * 100.0;
        for (int i = 0; i < fans; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "V":
                    countV++;
                    break;
                case "G":
                    countG++;
                    break;
            }
        }
        System.out.printf("%.2f%%\n", countA / fans * 100);
        System.out.printf("%.2f%%\n", countB / fans * 100);
        System.out.printf("%.2f%%\n", countV / fans * 100);
        System.out.printf("%.2f%%\n", countG / fans * 100);
        System.out.printf("%.2f%%", percentage);
        }
    }


