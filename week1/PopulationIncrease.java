import java.util.Scanner;

public class PopulationIncrease {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int tries = scanner.nextInt();
        while (tries-- >0) {
            int pA = scanner.nextInt();
            int pB = scanner.nextInt();
            float gA = scanner.nextFloat();
            float gB = scanner.nextFloat();
            int necessaryYears = 0;
            while (pA <= pB) {
                pA = (int)(pA + (pA * gA/100));
                pB = (int)(pB + (pB * gB/100));
                necessaryYears++;
                if (necessaryYears > 100) {
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }
            if (necessaryYears <= 100) System.out.println(necessaryYears+" anos.");
        }
    }
}
