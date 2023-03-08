import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IsolationCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            char[] chArr = sc.next().toCharArray();
            String[] arr = new String[n];
            for(int i=0;i<chArr.length;i++){
                arr[i]=String.valueOf(chArr[i]);
            }
            Map<String,Long> map = Stream.of(arr).map((ch)->String.valueOf(ch)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
            Set<String> keys = map.keySet();
           while (q-->0) {
            int qSize=0;
            int c = sc.nextInt();
            for(String key:keys){
                if(map.get(key)>c){
                    qSize +=map.get(key)-c;
                }
            }
            System.out.println(qSize);
           }
        }
        sc.close();
    }
}
