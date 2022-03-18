import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//problem code: PROGLANG
public class ProgrammingLang {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            int A1 = Integer.parseInt(input[2]);
            int B1 = Integer.parseInt(input[3]);
            int A2 = Integer.parseInt(input[4]);
            int B2 = Integer.parseInt(input[5]);
            if((A==A1 || A==B1) && (B==A1 || B==B1)){
                System.out.println(1);
            }else if((A==A2 || A==B2) && (B==A2 || B==B2)){
                System.out.println(2);
            }else{
                System.out.println(0);
            }
        }
        br.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
