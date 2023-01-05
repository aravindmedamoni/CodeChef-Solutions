import java.util.Scanner;

public class DailyTrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte x = sc.nextByte();
        byte n = sc.nextByte();
        String[] comparts = new String[9];
        int j=0;
        long ans=0;
        for(int i=0;i<n;i++){
            StringBuffer sb = new StringBuffer(sc.next());
            while(sb.length()!=0){
                byte len = (byte)sb.length();
                comparts[j++] = sb.substring(0, 4)+sb.substring(len-2,len);
                sb.replace(len-2, len, "");
                sb.replace(0, 4,"");
            }
            for(int l=0;l<comparts.length;l++){
                String s = comparts[l];
                //System.out.println(s);
                byte zerosCount=0;
                for(int k=0;k<s.length();k++){
                    if(s.charAt(k)=='0')
                    zerosCount++;
                }
                if(zerosCount>=x){
                    // System.out.println("zero "+fact(zerosCount));
                    // System.out.println("frnd "+fact(x));
                    // System.out.println("z-f "+fact(zerosCount-x));
                    ans +=fact(zerosCount)/(fact(x)*(fact(zerosCount-x)));
                }
            }
            j=0;

        }
        
        
        System.out.println(ans);
        sc.close();
    }

    static long fact(int n){
        long fact=n;
        if(fact==0){
            return 1;
        }
        while(--n>=1){
            fact *=n;
        }
        return fact;
    }
}
