import java.io.BufferedReader;
import java.io.InputStreamReader;

//problem code: BALLOON
public class ICPCBalloons{
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                int n = Integer.parseInt(br.readLine());
                String[] input = br.readLine().split(" ");
                int[] pNums = new int[n];
                for(int i=0;i<n;i++){
                    pNums[i] = Integer.parseInt(input[i]);
                }
                int count=0;
               // HashSet hs = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7));
                int j=7;
                for(int i=0;i<n && j>0;i++){
                    count++;
                    if(pNums[i]>=1 && pNums[i]<=7){
                        j--;
                    }
                }
                System.out.println(count);
            }
        } catch (Exception e) {
            
        }
    }
}