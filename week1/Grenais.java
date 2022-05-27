import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int request;
        int draw = 0;
        int inter = 0;
        int gremio = 0;
        int matches = 0;
        do {
            int team1 = scanner.nextInt();
            int team2 = scanner.nextInt();
            if (team1 > team2) inter++;
            else if (team1 < team2) gremio++;
            else draw++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            request = scanner.nextInt();
            matches++;
        }
        while (request == 1);
        System.out.println(matches+" grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + draw);
        if (inter > gremio) System.out.println("Inter venceu mais");
        else if (inter < gremio) System.out.println("Inter venceu mais");
        else System.out.println("Não houve vencedor");
    }
}
