import java.util.Scanner;

public class ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBadGrades = Integer.parseInt(scanner.nextLine());



        double numTask = 0.0;
        int counterOfBadGrades = 0;
        double sumOfGrades = 0.0;
        String lastProblem = "";
        boolean crash = true;



        while(counterOfBadGrades < numBadGrades) {
            String task = scanner.nextLine();
            if ("Enough".equals(task)) {
                crash = false;
                break;
            }
            int grade = Integer.parseInt(scanner.next());
            if (grade <= 4) {
                counterOfBadGrades++;
            }
            sumOfGrades += grade;
            numTask++;
            lastProblem = task;
            task = scanner.nextLine();
        }
        if(crash) {
            System.out.printf("You need a break, %d poor grades.", numBadGrades);
        } else {
            System.out.printf("Average score: %.2f %n", sumOfGrades/numTask);
            System.out.printf("Number of problems: %.0f%n", numTask);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
