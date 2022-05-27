import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0 && n < 1000000){
            int[] values = {100,50,20,10,5,2,1};
            System.out.println(n);
            for (int value : values) {
                System.out.println(n / value + " nota(s) de R$ " + value + ",00");
                n = n % value;
            }
        }
    }
}
