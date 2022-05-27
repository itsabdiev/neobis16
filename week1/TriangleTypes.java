import java.util.Arrays;
import java.util.Scanner;


public class TriangleTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] sides = new float[3];
        for (int r = 0; r < sides.length; r++) {
            sides[r] = scanner.nextFloat();
        }

        Arrays.sort(sides);
        float a = sides[2];
        float b = sides[1];
        float c = sides[0];
        if (a >= b + c) System.out.println("NAO FORMA TRIANGULO");
        else {
            if (a * a == (b * b + c * c)) System.out.println("TRIANGULO RETANGULO");
            if (a * a > (b * b + c * c)) System.out.println("TRIANGULO OBTUSANGULO");
            if (a * a < (b * b) + (c * c)) System.out.println("TRIANGULO ACUTANGULO");
            if (a == b && b == c) System.out.println("TRIANGULO EQUILATERO");
            if ((a == b && b != c) || (a == c && c != b) || (b == c && c != a))
                System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
