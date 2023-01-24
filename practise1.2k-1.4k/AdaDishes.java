import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AdaDishes {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-->0) {
        //     byte n = sc.nextByte();
        //     Byte[] arr = new Byte[n];
           
        //     for(byte i=0;i<n;i++){
        //         arr[i]=sc.nextByte();
        //     }
        //     Arrays.sort(arr);
        //     // byte b1=arr[0];
        //     // byte b2=arr[1];
        //     for(byte i=2;i<n;i++){
        //         if(arr[0]==arr[1]){
        //             arr[0] =Byte.valueOf(String.valueOf(arr[0]+arr[i]));
        //         }else if(arr[0]<arr[1]){
        //             arr[0] =Byte.valueOf(String.valueOf(arr[0]+arr[i]));
        //         }else{
        //             arr[1] = Byte.valueOf(String.valueOf(arr[1]+arr[i]));
        //         }
        //     }
        //     System.out.println(arr[0]>=arr[1]?arr[0]:arr[1]);
        //     // System.out.println(b1>=b2?b1:b2);
        
        // }
        // sc.close();
        Scanner sc = null;
        try{
            sc=new Scanner(System.in);
            int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextByte();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextByte();
            }
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                int temp=arr[n-(1+i)];
                arr[n-(1+i)]=arr[i];
                arr[i]=temp;
                n--;
                
            }
            n=arr.length;
            // byte b1=arr[0];
            // byte b2=arr[1];
            for(int i=2;i<n;i++){
                if(arr[0]==arr[1]){
                    arr[0] +=arr[i];
                }else if(arr[0]<arr[1]){
                    arr[0] +=arr[i];
                }else{
                    arr[1] +=arr[i];
                }
            }
            System.out.println(n>1?arr[0]>=arr[1]?arr[0]:arr[1]:arr[0]);
        
        }
        }catch(Exception e){
            System.out.println("out");
        }finally{
            sc.close(); 
        }
        
           
        
    }
}
