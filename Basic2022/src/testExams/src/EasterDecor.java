import java.util.Scanner;

public class EasterDecor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());


        int allWin = 0;
        int allLose = 0;
        double allMoney = 0;

        for (int i = 0; i < days; i++) {
            String sport = scanner.nextLine();
            int win = 0;
            int lose = 0;
            double money = 0;
            while (!"Finish".equals(sport)) {
                String result = scanner.nextLine();
                if ("win".equals(result)) {
                    win++;
                    allWin++;
                    money += 20;
                } else {
                    lose++;
                    allLose++;
                }
                sport = scanner.nextLine();
            }
            if (win > lose) {
                money *= 1.1;
            }
            allMoney += money;
        }
        if (allWin > allLose) {
            allMoney *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", allMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", allMoney);
        }

    }
}


