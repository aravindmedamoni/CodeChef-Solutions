import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//problem code: LAPIN
public class Lapindromes{
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            String s = ir.nextLine();
            int l = s.length();
            int mid = l/2-1;
            int[] count = new int[26];
            for(int i=0;i<l/2;i++){
                count[(int)s.charAt(i)-'a']++;
                System.out.println(s.charAt(i)-'a');
            }
            for(int i=l%2==1?mid+2:mid+1;i<l;i++){
                System.out.println(s.charAt(i)-'a');
                count[(int)s.charAt(i)-'a']--;
            }
            boolean isLapindrome=true;
            for(int i=0;i<26;i++){
                if(count[i]!=0){
                    isLapindrome=false;
                }
            }
            System.out.println(isLapindrome?"YES":"NO");
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
