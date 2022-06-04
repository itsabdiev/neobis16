import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main {
    
    static HashMap<Integer, Long> map = new HashMap<>();
    
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int tests = sc.nextInt();
        while(tests-- > 0){
            int n = sc.nextInt();
            System.out.println("Fib(" + n + ") = " + fib(n));
        }
            
    }
    
    static Long fib(int n){
        if(map.get(n) != null){
            return map.get(n);
        }
        if(n == 0){
            map.put(n, 0l);
            return 0l;
        }
        if(n <= 2){
            map.put(n, 1l);
            return 1l;
        }
        map.put(n, fib(n - 1) + fib(n - 2));
        return map.get(n);
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