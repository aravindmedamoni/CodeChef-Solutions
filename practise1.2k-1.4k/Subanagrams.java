import java.util.Scanner;

public class Subanagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        String[] strings = new String[n];
        Byte minLen = Byte.MAX_VALUE;
        byte minInd=0;
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(byte i=0;i<n;i++){
            strings[i]=sc.next();
            if(minLen>strings[i].length()){
                minLen=(byte)strings[i].length();
                minInd=i;
            }
        }
        StringBuffer sb = new StringBuffer();
        String s = strings[minInd];
        byte[] counts=new byte[26];
        for(byte j=0;j<s.length();j++){
            counts[s.charAt(j)-97]++;
        }
        for(byte k=0;k<26;k++){
          if(counts[k]>0){
            for(byte i=0;i<n;i++){
                byte count=0;
                String cString=strings[i];
                for(byte j=0;j<cString.length();j++){
                    if(cString.charAt(j)==letters[k])
                    count++;
                }
                if(count>0 && count<=counts[k]){
                    counts[k]=count;
                }
                if(count==0){
                    counts[k]=0;
                }
                
            }
          }

        }
        for(byte i=0;i<26;i++){
            if(counts[i]>0)
                    sb.append((letters[i]+"").repeat(counts[i]));
        }
        if(sb.length()>0){
            System.out.println(sb.toString());
        }else{
            System.out.println("no such string");
        }
        sc.close();
    }
}
