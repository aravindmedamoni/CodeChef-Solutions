import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
           
            p1 = p1%9==0?p1/9:p1/9+1;
            p2 = p2%9==0?p2/9:p2/9+1;
            if(p1<p2){
                System.out.println(0+" "+p1);
            }else{
                System.out.println(1+" "+p2);
            }
            // StringBuffer s1 =new StringBuffer("9".repeat(p1/9));
            // s1.append(p1%9==0?"":p1%9);
            // StringBuffer s2 =new StringBuffer("9".repeat(p2/9));
            // s2.append(p2%9==0?"":p2%9);
            // if(s1.length()<s2.length()){
            //     System.out.println(0+" "+s1.length());
            // }else{
            //     System.out.println(1+" "+s2.length());
            // }

        }
        sc.close();
    }
}
