import java.util.Scanner;

public class ChefHeaven {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int l = sc.nextInt();
            String s = sc.next();
            String ans="No";
            int zeroCount=0;
            int oneCount=0;
            for(int i=0;i<l;i++){
                if(s.charAt(i)=='1'){
                    oneCount++;
                }else{
                    zeroCount++;
                }
                if(oneCount>=zeroCount){
                    ans="Yes";
                    break;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
