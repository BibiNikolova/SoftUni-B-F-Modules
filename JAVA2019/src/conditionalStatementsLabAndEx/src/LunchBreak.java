import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int episode = Integer.parseInt(scanner.nextLine());
        int lunchBreak = Integer.parseInt(scanner.nextLine());
        double lunch = lunchBreak * 0.125;
        double quite = lunchBreak * 0.25;
        double timeLeft = lunchBreak - lunch - quite;

        if(episode <= timeLeft){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(timeLeft - episode));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(episode - timeLeft));
        }
    }
}
