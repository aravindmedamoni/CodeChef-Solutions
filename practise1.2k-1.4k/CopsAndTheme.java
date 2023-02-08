import java.util.Arrays;
import java.util.Scanner;

public class CopsAndTheme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            byte m = sc.nextByte();
            byte x = sc.nextByte();
            byte y = sc.nextByte();
            byte[] arr = new byte[m];
            for(byte i=0;i<m;i++){
                arr[i]=sc.nextByte();
            }
            Arrays.sort(arr);
            int count=0;
            if(((arr[0]-1)-(x*y))>0){
                count +=(arr[0]-1)-(x*y);
            }
            for(byte i=0;i<m-1;i++){
                count +=(((arr[i+1]-arr[i])-1)-(x*y*2))>0?((arr[i+1]-arr[i])-1)-(x*y*2):0;
                //System.out.println("count "+count);
            }
            if((100-(arr[m-1]+(x*y)))>0){
                count +=(100-(arr[m-1]+(x*y)));
                //System.out.println(" if2 count "+count);
            }
            System.out.println(count);
        }
        sc.close();
    }
}
