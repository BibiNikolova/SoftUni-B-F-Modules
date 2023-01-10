import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double gradeSum = 0;
        int countClass = 0;
        int countGrade = 0;
        int countTry = 0;


        while (countClass < 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                gradeSum += grade;
                countClass++;
                countGrade ++;
            } else if (grade < 4) {
                countTry++;
            }
            if (countTry == 2) {
                countClass ++;
                break;
            }
        }
        if(countClass < 12) {
            System.out.printf("%s has been excluded at %d grade", name, countClass);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f",name, gradeSum / 12);
        }
    }
}
