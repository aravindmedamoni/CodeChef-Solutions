import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Pushpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            //Arrays.sort(arr);
            Map<Long,Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(s->s,Collectors.counting()));
           
            long max=0;
            Set<Long> keys = map.keySet();
            for(Long key : keys){
                if(key+map.get(key)>=max){
                    max = key+(map.get(key)-1);
                }
            }
            System.out.println(max);
            // if(n>1){
            //     int i=1;
            //     int count=0;
            //     while(arr[n-1]==arr[n-(i+1)]){
            //         count++;
            //         i++;
            //     }
            //     //System.out.println(s.substring(n-10).toString());
            //     System.out.println(arr[n-1]+count);
            //     // if(arr[n-1]==arr[n-2]){
            //     //     //System.out.println("yes");
            //     //     System.out.println(++arr[n-1]);
            //     // }else{
            //     //     System.out.println(arr[n-1]);
            //     // }
            // }else{
            //     System.out.println(arr[0]);
            // }
        }
        sc.close();
        
    }
}
