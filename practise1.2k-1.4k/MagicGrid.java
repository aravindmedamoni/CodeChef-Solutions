import java.util.Scanner;

public class MagicGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            byte n = sc.nextByte();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(1+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
