import java.util.Scanner;

public class OldBook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();
        boolean isFound = false;
        int count = 0;
        String currentBook = scanner.nextLine();

        while (!"No More Books".equals(currentBook)) {
            if (currentBook.equals(book)) {
                isFound = true;
                break;
            }
            count++;
            currentBook = scanner.nextLine();
        }
            if(isFound) {
                System.out.printf("You checked %d books and found it.", count);
            } else {
                System.out.printf("The book you search is not here!%nYou checked %d books.", count);
            }
    }
}
