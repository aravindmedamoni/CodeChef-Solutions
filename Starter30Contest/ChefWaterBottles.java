import java.io.BufferedReader;
import java.io.InputStreamReader;

//problem code: CHEFBOTTLE
public class ChefWaterBottles {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                String[] input1 = br.readLine().split(" ");
                int n = Integer.parseInt(input1[0]);
                int x = Integer.parseInt(input1[1]);
                int k = Integer.parseInt(input1[2]);
                int count=0;
                while(n>0 && k-x>=0){
                    count++;
                    k = k-x;
                    n--;
                }
                System.out.println(count);
                
            }
            br.close();
        } catch (Exception e) {
            
        }
    }
}
