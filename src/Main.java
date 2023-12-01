import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        long p = 1;
        try {
            //       Scanner scanner = new Scanner(System.in);
            Scanner scanner = new Scanner("2000000000");
            long n = scanner.nextLong();

            while (p < n){
                i++;
                p = p*2;
            }
            System.out.println(i);
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
}