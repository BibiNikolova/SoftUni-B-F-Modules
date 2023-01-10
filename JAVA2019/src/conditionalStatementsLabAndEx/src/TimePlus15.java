import java.util.Scanner;

public class TimePlus15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int startTimeInMin = hour * 60 + minutes;
        int finalTimeInMin = startTimeInMin + 15;
        int hourIn15 = finalTimeInMin / 60;
        int minIn15 = finalTimeInMin % 60;

        if(hourIn15 >= 24){
            hourIn15 -=24;
        } else {

        } if (minIn15 < 10){
            System.out.printf("%d:%02d", hourIn15, minIn15);
        } else {
            System.out.printf("%d:%d", hourIn15, minIn15);
        }
    }
}
