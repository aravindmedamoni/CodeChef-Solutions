import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//problem code:SMOL
public class SmallestPossibleWholeNum {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                String[] values = br.readLine().split(" ");
                int n = Integer.parseInt(values[0]);
                int k = Integer.parseInt(values[1]);
                System.out.println(k>0?n%k:n);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
