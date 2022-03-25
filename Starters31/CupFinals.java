import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//problem code:CRICUP
public class CupFinals{
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int x = ir.nextInt();
            int y = ir.nextInt();
            int d = ir.nextInt();
            System.out.println(Math.abs(x-y)<=d?"yes":"no");
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



