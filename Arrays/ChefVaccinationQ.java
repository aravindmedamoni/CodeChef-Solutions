import java.io.BufferedReader;
import java.io.InputStreamReader;

//problem code: VACCINQ
public class ChefVaccinationQ{
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                String[] values = br.readLine().split(" ");
                int N = Integer.parseInt(values[0]);
                int P = Integer.parseInt(values[1]);
                int X = Integer.parseInt(values[2]);
                int Y = Integer.parseInt(values[3]);
                String[] pValues = br.readLine().split(" ");
                int[] persons = new int[N];
                for(int i=0;i<N;i++){
                    persons[i] = Integer.parseInt(pValues[i]);
                }
                int min = 0;
                for(int i=0;i<P;i++){
                    if(persons[i] == 0){
                        min +=X;
                    }else{
                        min +=Y;
                    }
                }

                System.out.println(min);
            }
            br.close();
        } catch (Exception e) {
            
        }
    }
}