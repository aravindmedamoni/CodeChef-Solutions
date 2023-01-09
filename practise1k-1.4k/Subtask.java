import java.util.Scanner;

public class Subtask {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            byte n = sc.nextByte();
            byte m = sc.nextByte();
            byte k = sc.nextByte();
            byte count=0;
            int i=0;
            for(;i<n;i++){
                if(sc.nextByte()==1){
                    count++;
                }else{
                    for(;i<n-1;i++){
                        sc.nextByte();
                    }
                    break;
                }
            }
            if(count==n){
                System.out.println(100);
            }else if(count>=m){
                System.out.println(k);
            }else{
                System.out.println(0);
            }
        }
        sc.close();
    }
}
