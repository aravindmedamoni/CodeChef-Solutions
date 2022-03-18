import java.io.BufferedReader;
import java.io.InputStreamReader;

//problem code:CSTOCK
public class ChefStockBuys {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                String[] values = br.readLine().split(" ");
                int s = Integer.parseInt(values[0]);
                int a = Integer.parseInt(values[1]);
                int b = Integer.parseInt(values[2]);
                int c = Integer.parseInt(values[3]);
                double stockPrice = s+((Double.valueOf(s)/100)*c);
                if(a<=stockPrice && stockPrice <=b){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
