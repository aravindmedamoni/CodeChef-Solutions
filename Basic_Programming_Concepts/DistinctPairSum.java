import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//problem code:MANYSUMS
public class DistinctPairSum {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
            while(t-->0){
                String[] input = br.readLine().split(" ");
                int l = Integer.parseInt(input[0]);
                int r = Integer.parseInt(input[1]);
                System.out.println(2*r-2*l+1);
               

            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
