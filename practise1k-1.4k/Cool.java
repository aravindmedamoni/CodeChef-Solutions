import java.util.Arrays;
import java.util.Scanner;

public class Cool {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            char[] ch = sc.next().toCharArray();
            Arrays.sort(ch);
            int count=0;
            for(int i=0;i<ch.length;i++){
                count +=((int)ch[i]-96)*(i+1);
            }
            System.out.println(count);
        }
        sc.close();
    }
}
