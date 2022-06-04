import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static FastReader sc = new FastReader();

    public static void main(String[] args) throws IOException {
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            String str1 = sc.next();
            String str2 = sc.next();
            String out = "";
            for(int j = 0; j < Math.min(str1.length(), str2.length()); j++){
                out += "" + str1.charAt(j) + str2.charAt(j);
            }
            if(str1.length() < str2.length()){
                out += "" + str2.substring(str1.length(), str2.length());
            }else{
                out += "" + str1.substring(str2.length(), str1.length());
            }
            sb.append(out).append("\n");
        }
        System.out.println(sb.toString().trim());
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