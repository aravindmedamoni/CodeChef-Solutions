import java.util.Scanner;

public class LittleChefSums{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int pos=-1;
            for(int i=0;i<n;i++){
                int val = sc.nextInt();
                if(val<min){
                    pos=i+1;
                    min=val;
                }
            }
            System.out.println(pos);
        }
        sc.close();
    }
}