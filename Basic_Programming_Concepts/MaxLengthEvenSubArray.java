import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxLengthEvenSubArray {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
               int n = Integer.parseInt(br.readLine());
               int sum= n*(n+1)/2;
               while(sum%2!=0){
                    sum -=n--; 
               }
               System.out.println(n);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
