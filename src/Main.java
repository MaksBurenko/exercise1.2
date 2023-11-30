import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        int p = 1;

        //       Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner("5");

        int n = scanner.nextInt();

        while (p < n){
            i++;
            p = p*2;
        }
        System.out.println(i);
    }
}