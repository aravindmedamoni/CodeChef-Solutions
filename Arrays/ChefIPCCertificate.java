import java.io.BufferedReader;
import java.io.InputStreamReader;

// problem code: IPCCERT
public class ChefIPCCertificate {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String[] values = br.readLine().split(" ");
                int N = Integer.parseInt(values[0]);
                int M = Integer.parseInt(values[1]);
                int K = Integer.parseInt(values[2]);
                int count=0;
                while(N-->0){
                    String[] inputValues = br.readLine().split(" ");
                    int[] wtQ = new int[K+1];
                    for(int i=0;i<K+1;i++){
                        wtQ[i] = Integer.parseInt(inputValues[i]);
                    }
                    
                    int sum=0;
                    if(wtQ[K]<=10){
                        for(int i=0;i<K;i++){
                            sum += wtQ[i];
                        }
                        if(sum>=M)
                        count++;
                    }
                }
                System.out.println(count);
                
            br.close();
        } catch (Exception e) {
            
        }
    }
}
