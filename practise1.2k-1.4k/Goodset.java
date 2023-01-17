import java.util.Scanner;

public class Goodset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            byte n = sc.nextByte();
            if(n==1){
                System.out.println(1);
            }else if(n==2){
                System.out.println("1 2");
            }else if(n==3){
                System.out.println("1 2 4");
            }else{
                int j=4;
                StringBuilder sb = new StringBuilder("1 2 4");
                for(int i=0;i<n-3;i++){
                    sb.append(" "+(j+3));
                    j=j+3;

                }
                System.out.println(sb.toString());
            }
        }
        sc.close();
    }
}
