import java.util.ArrayList;
import java.util.Scanner;

public class DistinctPalin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String res="";
        while (t-->0) {
            StringBuffer sb = new StringBuffer();
            int n = sc.nextInt();
            byte x = sc.nextByte();
            int temp = ((n&1)==1)?(n/2)+1:n/2;
            if(x<=temp){
                int i=0;
                //System.out.println("temp:"+temp);
                if(temp%x==0){
                    while (i<x) {
                        sb.append(letters[i++].repeat(temp/x));
                    }
                    i=0;
                   
                }else{
                    i=1;
                    //System.out.println(500%26);
                    sb.append(letters[0].repeat(temp-x+1));
                    //System.out.println("sb "+sb+" x "+x+" temp "+((temp-x)+1));
                    while(i<x){
                        sb.append(letters[i++].repeat(1));
                    }
                }
                if((n&1)==1){
                    res =sb.toString()+new StringBuffer(sb.substring(0,sb.length()-1)).reverse().toString();
                    
                }else{
                    res = sb.toString()+sb.reverse().toString();
                }
                System.out.println(res);
            }else{
                System.out.println(-1);
            }

        }
        sc.close();
    }
}
