import java.io.BufferedReader;
import java.io.InputStreamReader;

//problem code:CHFSPL
public class ChefNSpells {
    public static void main(String[] args) {
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                String[] values = br.readLine().split(" ");
                int[] arr = new int[values.length];
                for(int i=0;i<arr.length;i++){
                    arr[i] = Integer.parseInt(values[i]);
                }
                int first=0;
                int second=0;
                for(int j=0;j<arr.length;j++){
                    if(arr[j]>=first){
                        second = first;
                        first = arr[j];
                    }else if(arr[j]>second){
                        second = arr[j];
                    }
                }
                System.out.println(first+second);
            }
            br.close();
        } catch (Exception e) {
        }
    }
}
