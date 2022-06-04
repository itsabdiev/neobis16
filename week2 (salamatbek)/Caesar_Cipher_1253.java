import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            char[] chars = sc.next().toCharArray();
            int shift = sc.nextInt();
            for (int i = 0; i < chars.length; i++){
                int ch = (int)chars[i] - shift;
                if (ch < 65){
                    ch += 26;
                }
                chars[i] = (char) ch;
            }
            sb.append(String.valueOf(chars)).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}