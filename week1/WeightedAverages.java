import java.util.Scanner;


public class WeightedAverages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tries = scanner.nextInt();
        while (tries --> 0) {
            float result = (float)(((scanner.nextFloat() * 2.0) + (scanner.nextFloat() * 3.0) + (scanner.nextFloat() * 5.0)) / 10.0);
            String r = String.format("%.1f",result).replace(',','.');
            System.out.println(r);
        }
    }
}
