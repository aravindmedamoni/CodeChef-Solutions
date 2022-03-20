import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//problem code:COPS
public class CopsThievsDevu {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                String[] input = br.readLine().split(" ");
                int m = Integer.parseInt(input[0]);
                int x = Integer.parseInt(input[1]);
                int y = Integer.parseInt(input[2]);
                String[] input2 = br.readLine().split(" ");
                int[] copshouseNo = new int[m];
                for(int i=0;i<m;i++){
                    copshouseNo[i] = Integer.parseInt(input2[i]);
                }
                Arrays.sort(copshouseNo);

                int min=1;
                int max=100;
                int count=0;
                if(copshouseNo[0]-(x*y)>min){
                    count += (copshouseNo[0]-(x*y))-min;
                }
                min = copshouseNo[0]+(x*y);
                for(int i=1;i<m;i++){
                    if(copshouseNo[i]-(x*y)>min){
                        count += (copshouseNo[i]-(x*y))-min-1;
                    }
                    min = copshouseNo[i]+(x*y);
                    if(min>=max)
                    break;
                }
                if(min<max){
                    if(copshouseNo[m-1]+(x*y)<max){
                        count += max-(copshouseNo[m-1]+(x*y));
                    }
                }
                
               System.out.println(count);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
