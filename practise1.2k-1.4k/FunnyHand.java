import java.util.Scanner;

public class FunnyHand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(Math.abs(a-b)==2){
                System.out.println(1);
            }else if((a==b+1)||(a==b-1)){
                if((a==1 || b==1) || (a==n||b==n)){
                    System.out.println(1);
                }else{
                    System.out.println(2);
                }
            }else{
                //System.out.println("out else");
                System.out.println(0);
            }
        }
        sc.close();
    }
}
