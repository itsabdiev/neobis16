import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        char[] chars = sc.nextLine().toCharArray();
        StringBuilder vowels = new StringBuilder();
        for(char c : chars){
            if(c == 'a' || c == 'e' || c == 'u' || c == 'o' || c == 'i'){
                vowels.append(c);
            }
        }
        String ans = "S";
        if(!vowels.toString().equals(vowels.reverse().toString())){
            ans = "N";
        }
        System.out.println(ans);
    }
}