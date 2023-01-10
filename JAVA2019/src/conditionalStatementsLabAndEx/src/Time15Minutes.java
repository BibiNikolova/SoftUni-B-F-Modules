import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //Да се напише програма, която чете час и минути от 24-часово денонощие, въведени от потребителя и изчислява колко ще е часът след 15 минути.
        // Резултатът да се отпечата във формат часове:минути. Часовете винаги са между 0 и 23, а минутите винаги са между 0 и 59.
        // Часовете се изписват с една или две цифри. Минутите се изписват винаги с по две цифри, с водеща нула, когато е необходимо.
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int startTimeInMinutes = hour * 60 + minutes;
        int plusTime = startTimeInMinutes + 15;
        int plusTimeInHours = plusTime / 60;
        int plusTimeInMinutes = plusTime % 60;

        if (plusTimeInHours >= 24) {
            plusTimeInHours -=24;
        } else {
        }
        if (plusTimeInMinutes < 10) {
            System.out.printf("%d:0%d", plusTimeInHours, plusTimeInMinutes);
        } else {
            System.out.printf("%d:%d", plusTimeInHours, plusTimeInMinutes);
        }
    }
}
