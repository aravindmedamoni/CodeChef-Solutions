import java.io.BufferedReader;
import java.io.InputStreamReader;

//problem code: CHEFCHOCO
public class ChefChacolate {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                String[] input1 = br.readLine().split(" ");
                int c = Integer.parseInt(input1[0]);
                int x = Integer.parseInt(input1[1]);
                int y = Integer.parseInt(input1[2]);
                System.out.println((c-x)*y);
                
            }
            br.close();
        } catch (Exception e) {
            
        }
    }
}
