import java.io.BufferedReader;
import java.io.InputStreamReader;


// problem code: MAKEEQUAL
public class MakeThemEqual {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                int n = Integer.parseInt(br.readLine());
                String[] pValues = br.readLine().split(" ");
                int[] arr = new int[n];
                int maxEle=0;
                int minEle=Integer.parseInt(pValues[0]);
                for(int i=0;i<n;i++){
                    arr[i] = Integer.parseInt(pValues[i]);
                    if(maxEle <= arr[i])
                    maxEle = arr[i];
                    if(minEle >= arr[i])
                    minEle = arr[i];
                }
                System.out.println(maxEle-minEle); 
            }
            br.close();
        } catch (Exception e) {
            
        }
    }
}
