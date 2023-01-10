import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        //Да се въведат 3 числа и да се отпечата дали са еднакви (yes / no)

        if ((num == num1) && (num1 == num2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
