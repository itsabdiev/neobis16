import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        while(!str1.equals("")){
            int max = 0;
            for(int i = 0; i < str1.length(); i++){
                for(int j = i + 1; j <= str1.length(); j++){
                    if(str2.indexOf(str1.substring(i, j)) > -1){
                        if(j - i > max){
                            max = j - i;
                        }
                    }
                }
            }
            System.out.println(max);
            try{
                str1 = sc.nextLine();
                str2 = sc.nextLine();
            }catch(Exception e){
                str1 = "";
            }
        }
        
    }
}