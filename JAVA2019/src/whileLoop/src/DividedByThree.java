import java.util.Scanner;

public class DividedByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int div = 0;
        for(int i = 1 ; i>=1 && i<=100; i++){
            if(i % 3 == 0){
                div+= i;
                System.out.println(div);
                div = 0;
            }
        }
    }
}
