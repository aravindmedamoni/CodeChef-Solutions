import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//problem code:PROBCAT
public class ProblemCategory {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                int x = Integer.parseInt(br.readLine());
                if(x>=1 && x<100){
                    System.out.println("Easy");
                }else if(x>=100 && x<200){
                    System.out.println("Medium");
                }else if(x>=200 && x<=300){
                    System.out.println("Hard");
                }
            }
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
