import java.io.BufferedReader;
import java.io.InputStreamReader;


//problem code: CARVANS
public class Carvans {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                int n = Integer.parseInt(br.readLine());
                String[] input = br.readLine().split(" ");
                int[] carSpeeds = new int[n];
                for(int i=0;i<n;i++){
                    carSpeeds[i] = Integer.parseInt(input[i]);
                }
                int count=1;
                for(int i=1;i<n;i++){
                    boolean isLess=true;
                    int j=i;
                    while(j>0){
                        if(!(carSpeeds[j-1]>carSpeeds[i])){
                            isLess=false;
                            break;
                        }
                        j--;
                        
                    }
                    if(isLess){
                        count++;
                    }
                }
                System.out.println(count);
               
            }
        } catch (Exception e) {
            
        }
    }
}
