import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//problem code:SWAPCW
public class SwappingChef {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0){
                int n = Integer.parseInt(br.readLine());
                String input1 = br.readLine();
                String[] strArr = new String[n];
                for(int i=0;i<n;i++){
                    strArr[i] = String.valueOf(input1.charAt(i));
                }
                int start=0;
                int end = n-1;
                String[] tempArr = new String[n];
                    for(int i=0;i<n;i++){
                        tempArr[i] = strArr[i];
                    }
                    Arrays.sort(tempArr);
                    boolean isSorted=false;
                    while(start<=end){
                        if(strArr[start].compareTo(strArr[end])>0){
                            String temp = strArr[start];
                            strArr[start] = strArr[end];
                            strArr[end] = temp;
                        }
                        for(int i=0;i<n;i++){
                            if(tempArr[i].equals(strArr[i])){
                                isSorted=true;
                            }else{
                                isSorted=false;
                                break;
                            }
                        }
                        start++;
                        end--;
                        if(isSorted)
                        break;
                    }
                    // for(int i=0;i<n;i++){
                    //     if(tempArr[i].equals(strArr[i])){
                    //         isSorted=true;
                    //     }else{
                    //         isSorted=false;
                    //         break;
                    //     }
                    // }
                if(isSorted){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
            br.close();
        } catch (Exception e) {
            
        }
    }
}
