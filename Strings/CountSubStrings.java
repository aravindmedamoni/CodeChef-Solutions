import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//problem code: CSUB
public class CountSubStrings {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            String s = ir.next();
        System.out.println(numOfSubstrings1(s, n));
        }
        
    }

    public static int numOfSubstrings1(String s, int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        int sum=0;
        for(int i=1;i<=count;i++){
            sum +=i;
        }
        return sum;
    }

    public static int numOfSubStrings2(String s, int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(s.charAt(i)=='1' && s.charAt(j)=='1'){
                    count++;
                }
            }
        }

        return count;
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

