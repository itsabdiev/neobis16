import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = (int)(scanner.nextFloat()*100);
        int[] banknotes = {10000,5000,2000,1000,500,200};
        int[] coins = {100,50,25,10,5,1};
        int q;
        String [] notas = {"100.00","50.00","20.00","10.00","5.00","2.00"};
        String [] moedas = {"1.00","0.50","0.25","0.10","0.05","0.01"};
        System.out.println("NOTAS:");
        for (int r = 0; r < 6;r++) {
            q = i / banknotes[r];
            i = i % banknotes[r];
            System.out.println(q + " nota(s) de R$ " + notas[r]);
        }
        System.out.println("MOEDAS:");
        for (int r = 0; r < 6;r++) {
            q = i / coins[r];
            i = i % coins[r];
            System.out.println(q + " moeda(s) de R$ " + moedas[r]);
        }

    }
}
