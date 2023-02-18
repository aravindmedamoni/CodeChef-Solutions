import java.util.Arrays;
import java.util.Scanner;

public class Subtractiongame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            //System.out.println("arr[0] "+arr[0]);
            int result=arr[0];
           for(int i=1;i<n;i++){
            result = findGCD(result, arr[i]);
           }
           System.out.println(result);
        //     for(int i=0;i<n-1;i++){
        //         int temp =i;
        //         int a = findGCD(arr[i], arr[i+1]);
        //         if(a==1){
        //             result=1;
        //             break;
        //         }else{
        //             arr[i]=a;
        //             arr[i+1]=a;
        //             //boolean flag=false;
        //             if(temp>0 && arr[temp]!=arr[temp-1]){
        //                 result=1;
        //             }
        //             // while(temp>0 && arr[temp]!=arr[temp-1]){
        //             //     a = findGCD(arr[temp], arr[temp]);
        //             //     if(a==1){
        //             //         result=1;
        //             //         flag=true;
        //             //         break;
        //             //     }else{
        //             //         arr[temp]=a;
        //             //         arr[temp-1]=a;
        //             //         temp--;
        //             //     }
                        
        //             // }
        //             // if(flag)break;
        //         }

        //     }
        //     result = result==0?arr[0]:result;
        //     System.out.println(result);

        // }
        }
        sc.close();
    }

    public static int findGCD(int a, int b){
       // System.out.println("a "+a+" b "+b);
        if(b==0){
            //System.out.println("a "+a);
            return a;
        }
        return findGCD(b, a%b);
    }
}