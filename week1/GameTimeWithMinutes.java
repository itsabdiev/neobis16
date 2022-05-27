import java.util.Scanner;

public class GameTimeWithMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initHour = scanner.nextInt();
        int initMinute = scanner.nextInt();
        int finalHour = scanner.nextInt();
        int finalMinute = scanner.nextInt();
        int differenceInMinute = (finalHour * 60 + finalMinute) - (initHour * 60 + initMinute);
        if (differenceInMinute <=0 ) differenceInMinute+=1440;
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",differenceInMinute/60,differenceInMinute%60);
    }
}
