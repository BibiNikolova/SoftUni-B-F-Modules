import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numText = scanner.nextLine();
        int min = Integer.MAX_VALUE;

        while (true) {
            if(numText.equals("Stop")){
                break;
            }
            int num = Integer.valueOf(numText);
            if (num < min) {
                min = num;
            }
            numText = scanner.nextLine();
        }
        System.out.println(min);
    }
}




