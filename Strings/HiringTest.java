import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//problem code: HIRETEST
public class HiringTest {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int m = ir.nextInt();
            int x = ir.nextInt();
            int y = ir.nextInt();
            String result="";
            while(n-->0){
                int FCount=0;
                int pCount=0;
                String s = ir.next();
                for(int i=0;i<m;i++){
                    if(s.charAt(i)=='F'){
                        FCount++;
                    }else if(s.charAt(i)=='P'){
                        pCount++;
                    }
                }
                if(FCount>=x || (FCount == x-1 && pCount>=y)){
                    result +="1";
                }else{
                    result +="0";
                }

            }
            System.out.println(result);
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

    public double nextDouble(){
        return Double.parseDouble(next());
    }
}
