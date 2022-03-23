import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// problem code:PASSWD
public class StrongPassword {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int L=0,U=0,D=0,SP=0;
            String s = ir.next();
            int n = s.length();
            for(int i=0;i<n;i++){
                if(n>=10){
                    if(Character.isLowerCase(s.charAt(i))){
                        L=1;
                    }
                    if(i>0 && i<n-1){
                        if(Character.isUpperCase(s.charAt(i))){
                            U=1;
                        }
                        if(Character.isDigit(s.charAt(i))){
                            D=1;
                        }
                        if(s.charAt(i)=='@' || s.charAt(i)=='#' || s.charAt(i)=='%' || s.charAt(i)=='&' || s.charAt(i)=='?'){
                            SP=1;
                        }
                    }
                }
            }
            if(L==1&U==1&&D==1&&SP==1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
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



