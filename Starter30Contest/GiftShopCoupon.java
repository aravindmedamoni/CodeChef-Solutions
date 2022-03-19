import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//problem code: GFTSHP
public class GiftShopCoupon {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                String[] input1 = br.readLine().split(" ");
                int n = Integer.parseInt(input1[0]);
                int k = Integer.parseInt(input1[1]);
                String[] input2 = br.readLine().split(" ");
                int[] pArr = new int[n];
                for(int i=0;i<n;i++){
                    pArr[i] = Integer.parseInt(input2[i]);
                }
                Arrays.sort(pArr);
                int i=0;
                int count=0;
                while(i<n){
                    if(k-pArr[i]>=0||(k-(int)Math.round(Double.valueOf(pArr[i])/2))>=0){
                        count++;
                        k = k-pArr[i];
                    }
                    
                    i++;

                }
                System.out.println(count);
                
            }
            br.close();
        } catch (Exception e) {
            
        }
    }
}
