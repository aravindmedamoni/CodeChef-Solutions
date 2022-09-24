import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

//Problem Code:COLOUR
public class MaxmizeColours {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            Integer arr[] = new Integer[3];
            for(int i=0;i<3;i++)
                arr[i] = ir.nextInt();
            System.out.println(getMaxColours2(arr));
            
        }

    }

    public static int getMaxColours2(Integer arr[]){
        Arrays.sort(arr, Collections.reverseOrder());
        int maxColours=0;
        if(arr[0]>0){
            maxColours++;
            arr[0]--;
        }
        if(arr[1]>0){
            maxColours++;
            arr[1]--;
        }
        if(arr[2]>0){
            maxColours++;
            arr[2]--;
        }
        if(arr[0]>0 && arr[1]>0){
            maxColours++;
            arr[0]--;
            arr[1]--;
        }
        if(arr[0]>0 && arr[2]>0){
            maxColours++;
            arr[0]--;
            arr[2]--;
        }
        if(arr[1]>0 && arr[2]>0){
            maxColours++;
            arr[1]--;
            arr[2]--;
        }
        return maxColours;
    }

    public static int getMaxColours1(int a[]){
        int x = a[0];
            int y = a[1];
            int z = a[2];
            int maxColours=0;
            if(x==0 && y==0 && z==0){
                maxColours=0;
            }else if(x>=1 && y>=1 && z>=1){
                maxColours=3;
            }else if(x==0 && y!=0 && z!=0){
                maxColours=2;
            }else if(y==0 && x!=0 && z!=0){
                maxColours=2;
            }else if(z==0 && x!=0 && y!=0){
                maxColours=2;
            }else if(x==0 && y==0 && z!=0){
                maxColours=1;
            }else if(y==0 && z==0 && x!=0){
                maxColours=1;
            }else if(z==0 && x==0 && y!=0){
                maxColours=1;
            }
            Integer arr[] = {x,y,z};
            Arrays.sort(arr,Collections.reverseOrder());
            HashSet<String> hs = new HashSet<>();
            int i=0;
            while(i<3 && maxColours<6){
                if(arr[0]>1 && arr[1]>1 && !hs.contains("rg")){
                    maxColours++;
                    arr[0]--;
                    arr[1]--;
                    hs.add("rg");
                }
                if(arr[0]>1 && arr[2]>1 && !hs.contains("rb")){
                    maxColours++;
                    arr[0]--;
                    arr[2]--;
                    hs.add("rb");
                }
                if(arr[1]>1 && arr[2]>1 && !hs.contains("gb")){
                    maxColours++;
                    arr[2]--;
                    arr[1]--;
                    hs.add("gb");
                }
                i++;
                
            }
            return maxColours;
    }
}
