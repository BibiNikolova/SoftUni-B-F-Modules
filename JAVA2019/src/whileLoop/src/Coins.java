import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        int lv = Integer.parseInt(String.format("%.0f",Math.floor(change)));
        int st = Integer.parseInt(String.format("%.0f",(change - lv) * 100));
        int count = 0;

        while (lv > 0) {
            if (lv >= 2) {
                lv -= 2;
                count++;
            } else if (lv >= 1) {
                lv--;
                count++;
            }
        }
        while (st > 0) {
             if (st >=50) {
                st -=50;
                count ++;
            } else if (st >=20) {
                st -= 20;
                count ++;
            } else if (st >=10) {
                st -=10;
                count ++;
            } else if (st >=5) {
                st -=5;
                count ++;
            } else if (st >=2) {
                st -=2;
                count ++;
            } else if (st >=1) {
                st -=1;
                count ++;
            }
        }
        System.out.println(count);
    }
}
