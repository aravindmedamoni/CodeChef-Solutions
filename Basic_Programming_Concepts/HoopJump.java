import java.util.Scanner;

//problem code:HOOPS
public class HoopJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            System.out.println(N/2+1);
        }
        sc.close();
    }
}
