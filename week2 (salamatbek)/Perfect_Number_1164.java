import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main {
    
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int tests = sc.nextInt();
        while(tests-- > 0){
            int n = sc.nextInt();
            if(isPerfect(n)){
                System.out.println(n + " eh perfeito");
                continue;
            }
            System.out.println(n + " nao eh perfeito");
        }
    }
    
    static Boolean isPerfect(int n){
        int div = 1;
        int times = 0;
        while(div <= n / 2){
            if(n % div == 0){
                times += div;
            }
            div++;
        }
        return times == n;
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