import java.io.BufferedReader;
import java.io.InputStreamReader;

//problem code:NOBEL
public class NobelPrize {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                String[] input1=br.readLine().split(" ");
                int n = Integer.parseInt(input1[0]);
                int m = Integer.parseInt(input1[1]);
                String[] input2 = br.readLine().split(" ");
                int[] topics = new int[m+1];
                for(int i=0;i<n;i++){
                    topics[Integer.parseInt(input2[i])]++;
                }
                boolean isWon=false;
                for(int i=1;i<=m;i++){
                    if(topics[i]==0){
                        isWon=true;
                        break;
                    }
                }
                System.out.println(isWon?"yes":"no");
            }
            br.close();
        } catch (Exception e) {
            
        }
    }
}
