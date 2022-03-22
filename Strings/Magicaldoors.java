import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Magicaldoors {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            while(t-->0){
                char[] s = br.readLine().toCharArray();
                
                System.out.println(magicDoors(s));
            }

            br.close();
        } catch (Exception e) {
            
        }
    }

    public static int magicDoors(char[] s){
        int count=0;
        for(int i=0;i<s.length;){
            if(s[i]=='0'){
                for(int j=0;j<s.length;j++){
                    if(s[j]=='0')
                    s[j]='1';
                    else
                    s[j]='0';
                }
                count++;
            }
            while(i<s.length&&s[i]=='1'){
                i++;
            }
            
        }
        return count;
    }

    public static int magicDoors2(char[] s){
        int count=0;
        for(int i=0;i<s.length;){
            if(s[i]=='0'){
                count++;
                while(i<s.length&&s[i]=='0'){
                    i++;
                }
                if(i<s.length&&s[i]=='1')
                count++;
                while(i<s.length&&s[i]=='1'){
                    i++;
                }
            }
            while(i<s.length&&s[i]=='1'){
                i++;
            }
            
        }
        return count;
    }
}
