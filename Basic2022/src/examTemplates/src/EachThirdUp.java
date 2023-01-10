import java.util.Scanner;

public class EachThirdUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double empty = 0;
        double filled = 0;
        int count = 0;
        int numSuitcase = 0;
        String volume = scanner.nextLine();


        while (!"End".equals(volume)) {
            double trunk = Double.valueOf(input);
            double suitcaseVolume = Double.valueOf(volume);
            filled += suitcaseVolume;
            empty = trunk - filled;

            if (empty > 0) {
                count++;
                numSuitcase++;
                if (count == 3) {
                    empty -= (suitcaseVolume * 0.1);
                    count = 0;
                }
            } else {
                break;
            }
            volume = scanner.nextLine();
        }
        if (empty <= 0) {
            System.out.print("No more space!\n");
            System.out.printf("Statistic: %d suitcases loaded.", numSuitcase);
        } else {
            System.out.print("Congratulations! All suitcases are loaded!\n");
            System.out.printf("Statistic: %d suitcases loaded.", numSuitcase);
        }
    }
}