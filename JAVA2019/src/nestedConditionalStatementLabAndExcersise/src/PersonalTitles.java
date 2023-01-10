import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if("m".equals(gender)) {
            if (age < 16) {
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }
        }
        if ("f".equals(gender)) {
            if(age < 16) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        }
    }
}
