import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//problem code:TANDJ1
public class TomNJerry {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
            while(t-->0){
                String[] input = br.readLine().split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);
                int c = Integer.parseInt(input[2]);
                int d = Integer.parseInt(input[3]);
                int k = Integer.parseInt(input[4]);

                //METHOD-1:

                // while(a<c && k>0){
                //     a++;
                //     k--;
                // }
                // while(b<d && k>0){
                //     b++;
                //     k--;
                // }
                // while(k>0){
                //     if(b==d){
                //         b++;
                //     }else if(b>d){
                //         b--;
                //     }
                //     k--;
                // }
                
                // if(a==c && b==d){
                //     System.out.println("yes");
                // }else{
                //     System.out.println("no");
                // }

                //METHOD 2:

                k = (k-(Math.abs(c-a)+Math.abs(d-b)));

                if(k>=0 && k%2==0){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
                
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
