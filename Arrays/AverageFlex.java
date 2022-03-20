import java.io.BufferedReader;
import java.io.InputStreamReader;

//problem code:AVGFLEX
public class AverageFlex{
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                int n = Integer.parseInt(br.readLine());
                String[] input = br.readLine().split(" ");
                int[] marks = new int[n];
                for(int i=0;i<n;i++){
                    marks[i] = Integer.parseInt(input[i]);
                }
                int count=0;
                for(int i=0;i<n;i++){
                    int minScoreCount=0;
                    int maxScoreCount=0;
                    for(int j=0;j<n;j++){
                        if(i!=j){
                            if(marks[i]<marks[j]){
                                maxScoreCount++;
                            }else{
                                minScoreCount++;
                            }
                        }
                        
                    }
                    if(minScoreCount>=maxScoreCount){
                        count++;
                    }
                }
                System.out.println(count);
            }
        } catch (Exception e) {
            
        }
    }
}