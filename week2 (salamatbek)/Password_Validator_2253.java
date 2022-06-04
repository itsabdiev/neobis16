import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        String str = sc.next();
        Boolean dead = false;
        while(!dead){
            try{
                if(str.equals("")){
                    str = sc.nextLine();
                }
            }catch(Exception e){
                break;
            }
            if(str.length() < 6 || str.length() > 32){
                System.out.println("Senha invalida.");
            }else{
                String ans;
                boolean hasN = false;
                boolean hasUL = false;
                boolean hasLL = false;
                boolean hasWrong = false;
                for(int i = 0; i < str.length(); i++){
                    char c = str.charAt(i);
                    if(Character.isDigit(c)){
                        hasN = true;
                    }else if(Character.isAlphabetic(c)){
                        if(Character.isLowerCase(c)){
                            hasLL = true;
                        }else{
                            hasUL = true;
                        }
                    }else{
                        hasWrong = true;
                        break;
                    }
                }
                if(hasWrong){
                    ans = "Sehna invalida.";
                }else if(hasUL && hasLL && hasN){
                    ans = "Sehna valida.";
                }else{
                    ans = "Sehna invalida.";
                }
                if(str != null || str != "" || str != "\n"){
                    System.out.println(ans);
                }
            }
            try{
                str = sc.next();
                if(str.equals("")){
                    str = sc.next();
                }
            }catch(Exception e){
                dead = true;
            }
        }
      
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}