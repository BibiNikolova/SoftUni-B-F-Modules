import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numText = scanner.nextLine();
        int max = Integer.MIN_VALUE;

        while (true) {
            if(numText.equals("Stop")){
                break;
            }
            int num = Integer.valueOf(numText);
            if (num > max) {
                max = num;
            }
            numText = scanner.nextLine();
        }
        System.out.println(max);
    }
}



