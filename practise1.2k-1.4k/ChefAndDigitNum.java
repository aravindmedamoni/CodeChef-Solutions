import java.util.Scanner;

public class ChefAndDigitNum {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            char[] ch = sc.next().toCharArray();
            int zerosCount=0;
            int onesCount=0;
            for(int i=0;i<ch.length;i++){
                if(ch[i]=='0')
                zerosCount++;
                else
                onesCount++;
            }
            if(zerosCount==1 || onesCount==1)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
        sc.close();
    }
}
