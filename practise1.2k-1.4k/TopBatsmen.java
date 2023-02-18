import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TopBatsmen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            Byte[] arr  = new Byte[11];
            for(int i=0;i<11;i++){
                arr[i] = sc.nextByte();
            }
            byte w = sc.nextByte();
            Arrays.sort(arr,Comparator.reverseOrder());
            //Arrays.sort(arr,Collections.reverseOrder());
            byte count=0;
            for(byte i=0;i<11;i++){
                if(arr[i]==arr[w-1]){
                    count++;
                }
            }
            for(byte i=0;i<11;i++){
                if(arr[i]==arr[w-1]){
                    w=(byte)(w-i);
                    break;
                }
            }
            System.out.println(fact(count)/(fact(w)*(fact(count-w))));
        }
        sc.close();
    }

    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
	}
}
