import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//problem code:NFS
public class TurnIt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] input = br.readLine().split(" ");
            int U = Integer.parseInt(input[0]);
            int V = Integer.parseInt(input[1]);
            int A = Integer.parseInt(input[2]);
            int S = Integer.parseInt(input[3]);
            if(U==1 && V==1){
                System.out.println("yes");
            }else{
                if(U*U-2*A*S<=V*V){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }

        }
        br.close();
    }
}
