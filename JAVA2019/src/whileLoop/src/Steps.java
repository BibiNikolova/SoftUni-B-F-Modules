import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dailySteps = 0;


        while (dailySteps < 10000) {
            String input = scanner.nextLine();
            if ("Going home".equals(input)) {
                int backHomeSteps = Integer.parseInt(scanner.nextLine());
                dailySteps += backHomeSteps;
                break;
            }
            int steps = Integer.valueOf(input);
            dailySteps += steps;
            }
        if(dailySteps >= 10000) {
            System.out.printf("Goal reached! Good job!\n");
            System.out.printf("%d steps over the goal!", dailySteps - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - dailySteps);
        }

    }
}
