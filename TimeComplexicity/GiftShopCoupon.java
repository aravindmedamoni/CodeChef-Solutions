

import java.util.Arrays;
import java.util.Scanner;

public class GiftShopCoupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] prices = new int[n];
            for(int i=0;i<n;i++){
                prices[i]=sc.nextInt();
            }
            Arrays.sort(prices);
            int count=0;
            for(int i=0;i<n;i++){
                if(prices[i]<=k){
                    count++;
                    k -=prices[i];
                }else{
                    byte j = (byte)((prices[i]&1)==1?1:0);
                    if(prices[i]/2+j<=k){
                        count++;
                        k -=prices[i]/2;
                    }else{
                        break;
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
