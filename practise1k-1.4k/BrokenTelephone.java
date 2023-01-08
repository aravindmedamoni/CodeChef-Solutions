import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BrokenTelephone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            Set<Integer> res = new HashSet<>();
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=1;i<n;i++){
                if(arr[i] != arr[i-1]){
                    res.add(i);
                    res.add(i-1);
                }
            }
            System.out.println(res.size());
            // long firstEle= arr[0];
            // long lastEle = arr[n-1];
            // int count=1;
            // boolean flag = true;
            // int index=0;
            // int maxCount=count;
            // for(int i=1;i<n;i++){
            //     if(firstEle==arr[i]){
            //         count++;
            //     }else{
            //         if(flag){
            //             index=i;
            //             flag=false;
            //         }
            //        if(count>maxCount){
            //         maxCount = count;
            //        }
            //        count=0;
            //     }
            // }
            // if(count>maxCount){
            //     maxCount = count;
            //    }
            //    //System.out.println("count "+count);
            // if(count==n){
            //     System.out.println(0);
            // }else if(count !=n && maxCount>1 && firstEle==lastEle){
            //     System.out.println(n-(index+1));
            // }else if(maxCount==1){
            //     System.out.println(n);
            // }else if(count !=n && firstEle!=lastEle){
            //     System.out.println(n);
            // }else{
            //     System.out.println(n-maxCount);
            // }
        }
        sc.close();
    }
}
