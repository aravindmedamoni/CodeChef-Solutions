import java.io.BufferedReader;
import java.io.InputStreamReader;


// problem code: SUBTASK
public class SubtaskProblem {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                String[] input1 = br.readLine().split(" ");
                int n = Integer.parseInt(input1[0]);
                int m = Integer.parseInt(input1[1]);
                int k = Integer.parseInt(input1[2]);
                String[] input2 = br.readLine().split(" ");
                int[] tValues = new int[n];
                for(int i=0;i<n;i++){
                    tValues[i] = Integer.parseInt(input2[i]);
                }
                int count=0;
                for(int i=0;i<m;i++){
                    if(tValues[i]==1)
                    count++;
                }
                if(count==m){
                    for(int i=m;i<n;i++){
                        if(tValues[i]==1)
                        count++;
                        else{
                            count=m;
                            break;
                        }
                    }
                    
                }
                System.out.println(count==n?100:count==m?k:0);
            }
            br.close();
        } catch (Exception e) {
            
        }
    }
}
