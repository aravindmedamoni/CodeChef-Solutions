import java.util.Scanner;

public class SuspenseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            StringBuffer sb = new StringBuffer(sc.next());
            String resultString= "";
            int temp=n-1;
            for(int i=0;i<=temp;i++){
                if(sb.charAt(i)=='0'){
                   resultString = "0"+resultString;
                }else{
                    resultString +="1";
                }
                if(i!=temp){
                    if(sb.charAt(temp--)=='0'){
                        resultString +="0";
                    }else{
                        resultString = "1"+resultString;
                    }
                }
                
            }
            System.out.println(resultString);
        }
        sc.close();
    }
}
