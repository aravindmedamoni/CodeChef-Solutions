import java.io.BufferedReader;
import java.io.InputStreamReader;

// problem code: CASH
public class HardCash {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                String[] input1 = br.readLine().split(" ");
                int n = Integer.parseInt(input1[0]);
                int k = Integer.parseInt(input1[1]);
                String[] input2 = br.readLine().split(" ");
                int[] coinsInBag = new int[n];
                for(int i=0;i<n;i++){
                    coinsInBag[i] = Integer.parseInt(input2[i]);
                }
                int sum=0;
                for(int i=0;i<n;i++){
                    if(coinsInBag[i]%k!=0){
                        int rem = coinsInBag[i]%k;
                        int diff = k-rem;
                        if(sum>=diff){
                            coinsInBag[i] = coinsInBag[i]+diff;
                            sum -= diff;
                        }else{
                            sum +=rem;
                        }
                    }
                }
                System.out.println(sum);
            }
            br.close();
        } catch (Exception e) {
            
        }
    }  
}
