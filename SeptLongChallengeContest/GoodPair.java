
import java.util.Collection;
import java.util.Hashtable;

//Problem Code:EQPAIR
public class GoodPair {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = ir.nextLong();
            }

            Hashtable<Long,Long> ht = new Hashtable<>();
            for(int i=0;i<n;i++){
                if(ht.containsKey(arr[i])){
                    long v = ht.get(arr[i]);
                    ht.put(arr[i], ++v);
                }else{
                    ht.put(arr[i], 1L);
                }
            }
            long sum=0;
            Collection<Long> c= ht.values();
            for(long v:c){
                sum +=(v*(v-1)/2);
            }
            System.out.println(sum);
            
            //METHOD:1 {TLE}
            // Hashtable<String,Boolean> ht = new Hashtable<>();
            // int count=0;
            // for(int i=0;i<n-1;i++){
            //     for(int j=i+1;j<n;j++){
            //         long a = arr[i];
            //         long b = arr[j];
            //         String s = a+""+b;
            //         String rs = new StringBuffer(s).reverse().toString();
            
            //         if(ht.containsKey(s)){
            //             if(ht.get(s)){
            //                 count++;
            //             }
            //         }else if(ht.containsKey(rs)){
            //             if(ht.get(rs)){
            //                 count++;
            //             }
            //         }else{
            //             while(b>0){
            //                 long temp=a;
            //                 a=b;
            //                 b= temp%b;
            //             }
            //             //  System.out.println("gcd of"+arr[i]+" "+arr[j]+"is "+a);
            //             //  System.out.println("lcm "+((arr[i])*(arr[j]))/a);
            //             if(a == ((arr[i])*(arr[j]))/a){
            //                 count++;
                            
            //                 ht.put(s, true);
            //               //  System.out.println("yes");
            //             }else{
                            
            //                 ht.put(s, false);
            //             }
            //         }
                    
            //     }
            // }
            // System.out.println(count);
        }
    }
}
