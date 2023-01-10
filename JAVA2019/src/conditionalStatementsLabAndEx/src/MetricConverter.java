import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double convertedNumber = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        if (input.equals("mm")) {
            convertedNumber /= 1000;
        } else if(input.equals("cm")) {
            convertedNumber /= 100;
        }
        if (output.equals("mm")) {
            convertedNumber *= 1000;
        } else if(output.equals("cm")) {
            convertedNumber *= 100;
        }
        System.out.printf("%.3f", convertedNumber);
        }
    }

