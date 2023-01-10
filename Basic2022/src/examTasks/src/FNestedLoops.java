import java.util.Scanner;

public class FNestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isvalid = false;

        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {
                        int sum = a + b + c + d;
                        int prodOfNum = a * b * c * d;
                        if (((sum == prodOfNum) && (n % 10 == 5)) || ((prodOfNum / sum == 3) && (n % 3 == 0))) {
                            isvalid = true;
                            if ((sum == prodOfNum) && (n % 10 == 5)) {
                                System.out.printf("%d%d%d%d", a, b, c, d);
                                break;
                            } else {
                                String a1 = Integer.toString(a);
                                String b1 = Integer.toString(b);
                                String c1 = Integer.toString(c);
                                String d1 = Integer.toString(d);
                                System.out.printf("%s%s%s%s", d1, c1, b1, a1);
                                break;
                            }
                        }
                    }
                    if (isvalid) {
                        break;
                    }
                }
                if (isvalid) {
                    break;
                }
            }
            if (!isvalid) {
                System.out.print("Nothing found");
                break;
            }
        }
    }
}
