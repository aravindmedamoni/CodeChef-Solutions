import java.util.Scanner;

public class MinGoodPermutation {
    
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            if((n&1)==1){
                int i=0;
                for(;i<n-1;i +=2){
                    arr[i] = i+2;
                    arr[i+1]=i+1;
                }
                arr[i]=arr[n-2];
                arr[i-1]=n;
            }else{
                for(int i=0;i<n;i +=2){
                    arr[i] = i+2;
                    arr[i+1]=i+1;
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
