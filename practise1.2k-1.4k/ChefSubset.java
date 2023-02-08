import java.util.Arrays;
import java.util.Scanner;

public class ChefSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int[] arr = new int[4];
            for(byte i=0;i<4;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            boolean flag = false;
            int count=0;
            if(arr[0]<=0){
                for(byte i=0;i<4;i++){
                    if(arr[i]==0){
                        flag=true;
                        break;
                    }else{
                        byte j=(byte)(i+1);
                        count +=arr[i];
                        boolean isBreak=false;
                        while(j<4){
                            System.out.println("count "+count);
                            System.out.println("i "+i);
                            if(arr[i]+arr[j]==0){
                                flag=true;
                                isBreak=true;
                                break;
                            }
                            j++;
                        }
                        if(isBreak){
                            break;
                        }
                        j=(byte)(i+1);
                        while(j<4){
                            System.out.println("count2 "+count);
                            System.out.println("i2 "+i);
                            if(count+arr[j]==0){
                                flag=true;
                                isBreak=true;
                                break;
                            }
                            j++;
                        }
                        if(isBreak){
                            break;
                        }
                    }
    
                }
            }else{
                flag=false;
            }
            if(flag){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
