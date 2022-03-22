import java.io.BufferedReader;
import java.io.InputStreamReader;

//problem code:PAWRI
public class PawriMeme{
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            while(t-->0){
                String s = br.readLine();
                System.out.println(s.replaceAll("party", "pawri"));
            }

            br.close();
        } catch (Exception e) {
            
        }
    }
}