import java.io.BufferedReader;
import java.io.InputStreamReader;

//problem code:ERROR
public class ChefFeedback {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int n = Integer.parseInt(br.readLine());
                while(n-->0){
                    boolean found=false;
                    String w = br.readLine();
                        if(w.contains("010") || w.contains("101")){
                            found=true;
                        }else{
                            found=false;
                            
                        }
                    System.out.println(found?"Good":"Bad");
                }

            br.close();
        } catch (Exception e) {
            
        }
    }
}
