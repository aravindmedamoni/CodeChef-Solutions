import java.io.BufferedReader;
import java.io.InputStreamReader;

//problem code:	COLGLF2
public class CollegeLife2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                int s = Integer.parseInt(br.readLine());
                String[] input = br.readLine().split(" ");
                int[] adtime = new int[s];
                for(int i=0;i<s;i++){
                    adtime[i] = Integer.parseInt(input[i]);
                }
                long totalSum=0;
                int j=0;
                while(s-->0){
                    String[] input2 = br.readLine().split(" ");
                    int numOfepi = Integer.parseInt(input2[0]);
                    int[] epDuration = new int[numOfepi];
                    for(int i=0;i<numOfepi;i++){
                        epDuration[i] = Integer.parseInt(input2[i+1]);
                    }
                    long sum=epDuration[0];
                    for(int i=1;i<numOfepi;i++){
                        sum +=epDuration[i]-adtime[j];
                    }
                    totalSum +=sum;
                    j++;
                    
                }
                System.out.println(totalSum);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
