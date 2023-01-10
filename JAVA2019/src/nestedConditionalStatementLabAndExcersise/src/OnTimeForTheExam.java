import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examlHour = Integer.parseInt(scanner.nextLine());
        int examMins = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMins = Integer.parseInt(scanner.nextLine());

        int examTimeInMins = examlHour * 60 + examMins;
        int arrivalTimeInMins = arrivalHour * 60 + arrivalMins;

        int diff = examTimeInMins - arrivalTimeInMins;

        if (diff < 0) {
            System.out.println("Late");
            if (diff > -60){
                System.out.printf("%d minutes after the start", Math.abs(diff));
            } else {
                int hours = Math.abs(diff) / 60;
                int mins = Math.abs(diff) % 60;
                System.out.printf("%d:%02d hours after the start", hours, mins);
            }
        } else if (diff >= 0 && diff <= 30){
            System.out.println("On time");
            if (diff > 0){
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Early");
            if (diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                int hours = diff / 60;
                int mins = diff % 60;
                System.out.printf("%d:%02d hours before the start", hours, mins);
            }
        }
    }
}
