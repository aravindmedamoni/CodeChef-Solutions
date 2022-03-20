import java.io.BufferedReader;
import java.io.InputStreamReader;

// problem code: BEGGASOL
public class GasolineIntro {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                int n = Integer.parseInt(br.readLine());
                String[] input = br.readLine().split(" ");
                int[] gasL = new int[n];
                for(int i=0;i<n;i++){
                    gasL[i] = Integer.parseInt(input[i]);
                }
                int sum=gasL[0];
                int count=0;
                int i=1;
                while(i<5&&sum>0){
                    sum--;
                    sum +=gasL[i];
                    count++;
                    i++;
                }
                System.out.println(sum+count);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
