package TimeComplexicity;

import java.util.Scanner;

public class FriendshipTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            byte n = sc.nextByte();
            byte[] arr=new byte[101];
            for(int i=0;i<n;i++){
                arr[sc.nextByte()]++;
            }
            byte count=0;
            for(int i=0;i<101;i++){
                if(arr[i]>0)
                count++;
                if(count==n)
                break;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
