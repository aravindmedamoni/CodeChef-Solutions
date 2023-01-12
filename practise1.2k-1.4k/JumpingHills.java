import java.util.Scanner;

public class JumpingHills {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            byte n = sc.nextByte();
            int u = sc.nextInt();
            int d = sc.nextInt();
            int count=0;
            boolean parachute=true;
            int start=sc.nextInt();
            int i=1;
            for(;i<n;i++){
                int nextHill = sc.nextInt();
                if(start-nextHill >=-u && start-nextHill <=d){
                    count++;
                    start = nextHill;
                }else if(start-nextHill>d &&parachute){
                    count++;
                    parachute=false;
                    start=nextHill;
                }else{
                    break;
                }
                

            }
            for(;i<n-1;i++){
                sc.nextInt();
            }
            System.out.println(count+1);
        }
        sc.close();
    }
}
