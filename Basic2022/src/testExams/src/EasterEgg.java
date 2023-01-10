import java.util.Scanner;

public class EasterEgg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggs = Integer.parseInt(scanner.nextLine());
        int countOrange = 0;
        int countRed = 0;
        int countBlue = 0;
        int countGreen = 0;
        int max = Integer.MIN_VALUE;
        String maxColour = null;
        for (int i = 0; i < eggs; i++) {
            String colour = scanner.nextLine();
            switch (colour) {
                case "orange":
                    countOrange++;
                    if (countOrange > max) {
                        max = countOrange;
                        maxColour = colour;
                    }
                    break;
                case "red":
                    countRed++;
                    if (countRed > max) {
                        max = countRed;
                        maxColour = colour;
                    }
                    break;
                case "blue":
                    countBlue++;
                    if (countBlue > max) {
                        max = countBlue;
                        maxColour = colour;
                    }
                    break;
                case "green":
                    countGreen++;
                    if (countGreen > max) {
                        max = countGreen;
                        maxColour = colour;
                    }
                    break;
            }
        }
        System.out.printf("Red eggs: %d\n", countRed);
        System.out.printf("Orange eggs: %d\n", countOrange);
        System.out.printf("Blue eggs: %d\n", countBlue);
        System.out.printf("Green eggs: %d\n", countGreen);
        System.out.printf("Max eggs: %d -> %s", max, maxColour);
    }
}
