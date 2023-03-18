import java.util.Scanner;

public class ButtonPairs {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int oddCount = 0;
            int evenCount = 0;
            for(int i=0;i<n;i++){
                int val = sc.nextInt();
                if((val&1)==1){
                    oddCount++;
                }else{
                    evenCount++;
                }
            }
            if(n==1 || oddCount == 0 || evenCount == 0){
                System.out.println(0);
            }else{
                System.out.println((long)evenCount*oddCount);
            }
        }
        sc.close();
    }
}
