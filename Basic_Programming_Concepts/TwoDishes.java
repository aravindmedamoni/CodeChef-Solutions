import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//problem code: TWODISH
public class TwoDishes {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int A = Integer.parseInt(input[1]);
            int B = Integer.parseInt(input[2]);
            int C = Integer.parseInt(input[3]);
            int sum=0;
            while(A>0&&B>0){
                sum++;
                A--;
                B--;
            }
            while(B>0 && C>0){
                sum++;
                B--;
                C--;
            }
            if(sum>=N){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        br.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
