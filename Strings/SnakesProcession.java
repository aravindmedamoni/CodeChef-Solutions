import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//problem code: SNAKPROC
public class SnakesProcession {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int r = ir.nextInt();
        while(r-->0){
            int n = ir.nextInt();
            String s = ir.next();
            int count=0;
            for(int i=0;i<n;i++){
                if(count>1){
                    break;
                }else if(s.charAt(i)=='H' && count>=0){
                    count++; 
                }else if(s.charAt(i)=='T'){
                    count--;
                }
            }
            System.out.println(count==0?"valid":"Invalid");
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



