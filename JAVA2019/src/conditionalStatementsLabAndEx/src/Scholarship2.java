import java.util.Scanner;

public class Scholarship2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double average = Double.parseDouble(scanner.nextLine());
        double minSelary = Double.parseDouble(scanner.nextLine());
        double socialScholarship = 0.0;
        double excellentScholarship = 0.00;

        if (income < minSelary && average > 4.50){
            socialScholarship = Math.floor(minSelary * 0.35);
        }
        if (average >= 5.50){
            excellentScholarship = Math.floor(average * 25);
        }
        if (socialScholarship !=0 && socialScholarship > excellentScholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        }
        else if(excellentScholarship !=0 && excellentScholarship >= socialScholarship) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
        }
        else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}


