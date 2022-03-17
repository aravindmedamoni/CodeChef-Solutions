
// problem code: CHOPRT

import java.util.Scanner;

public class ChefNOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int[] arr = new int[2];
            for(int j=0;j<2;j++){
                 arr[j] = sc.nextInt(); 
            }
            if(arr[0]<arr[1]){
                System.out.println('<');
            }else if(arr[0]>arr[1]){
                System.out.println('>');
            }else{
                System.out.println('=');
            }
        }
        sc.close();
    }
}
