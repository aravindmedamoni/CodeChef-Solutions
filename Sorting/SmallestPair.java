import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//problem code:SMPAIR
public class SmallestPair{
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            long[] seq = new long[n];
            for(int i=0;i<n;i++){
                seq[i] = ir.nextLong();
            }
            Arrays.sort(seq);
            System.out.println(seq[0]+seq[1]);
        }
    }
}

    class InputReader{
        private BufferedReader br;
        InputReader(InputStream is){
            br = new BufferedReader(new InputStreamReader(is));
        }
        private StringTokenizer st;
        public String nextLine(){
            String s=null;
            try {
                s = br.readLine();
            } catch (Exception e) {
            
            }
            return s;
        }
        public String next(){
            if(st == null || !st.hasMoreTokens()){
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            return st.nextToken(" ");
        }

        public int nextInt(){
            return Integer.parseInt(next());
        }

        public long nextLong(){
            return Long.parseLong(next());
        }

        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }