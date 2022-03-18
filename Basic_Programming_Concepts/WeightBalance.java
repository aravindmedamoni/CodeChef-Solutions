import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//problem code:WEIGHTBL
public class WeightBalance {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] input = br.readLine().split(" ");
            int w1 = Integer.parseInt(input[0]);
            int w2 = Integer.parseInt(input[1]);
            int x1 = Integer.parseInt(input[2]);
            int x2 = Integer.parseInt(input[3]);
            int M = Integer.parseInt(input[4]);
            
            int increadeWeight = w2-w1;

            if(M*x1<=increadeWeight && increadeWeight <=M*x2){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
            
        }
        br.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
