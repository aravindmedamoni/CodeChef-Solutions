import java.io.BufferedReader;
import java.io.InputStreamReader;

//problem code:TWOSTR
public class WildcardMatch {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                String x = br.readLine();
                String y = br.readLine();
                boolean isMatched = false;
                for(int i=0;i<x.length();i++){
                    if(x.charAt(i)==y.charAt(i) || x.charAt(i)=='?'|| y.charAt(i) == '?'){
                        isMatched = true;
                    }else{
                        isMatched = false;
                        break;
                    }
                }
                System.out.println(isMatched?"Yes":"No");
            }

            br.close();
        } catch (Exception e) {
            
        }
    }
}
