import java.io.BufferedReader;
import java.io.InputStreamReader;

//problem code: ALPHABET
public class StudyingAlphabet {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                int n = Integer.parseInt(br.readLine());
                while(n-->0){
                    boolean heCanRead=false;
                    String w = br.readLine();
                    for(int i=0;i<w.length();i++){
                        if(s.contains(String.valueOf(w.charAt(i)))){
                            heCanRead=true;
                        }else{
                            heCanRead=false;
                            break;
                        }
                    }
                    System.out.println(heCanRead?"Yes":"No");
                }

            br.close();
        } catch (Exception e) {
            
        }
    }
}
