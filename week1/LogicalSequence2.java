import java.util.Scanner;

public class LogicalSequence2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int tillIn = scanner.nextInt();
        int zero = 1;
        for (int w = 1;w <= tillIn;w++) {
            System.out.print(w);
            if (zero >= q) {
                System.out.println();
                zero = 0;
            }
            else {
                System.out.print(" ");
            }
            zero++;
        }
    }
}
