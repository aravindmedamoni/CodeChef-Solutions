
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.SortedMap;
import java.util.TreeMap;


public class PokemonBottles {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            Integer A[] = new Integer[n];
                int b[] =new int[n];
                HashMap<Integer,Integer> map = new HashMap<>();
                int ans =1;
                for (int i=0;i<n;i++)
                {
                    A[i] = ir.nextInt();
                }
                for (int i=0;i<n;i++)
                {
                    b[i] = ir.nextInt();
                    map.put(A[i] ,b[i]);

                }

                Arrays.sort(A, Collections.reverseOrder());
                int big =map.get(A[0]);
                for (int i=1 ;i<n;i++)
                {
                    System.out.println("Big: "+big);
                    System.out.println("Map vl: "+map.get(A[i]));
                    if ((map.get(A[i]) >big))
                    {
                        big =map.get(A[i]);
                        ans +=1;
                    }
                }
                System.out.println(ans);
            // long arr[][] = new long[n][n];
            // for(int i=0;i<2;i++){
            //     for(int j=0;j<n;j++){
            //         arr[i][j] = ir.nextLong();
            //     }
            // }
            // TreeMap<Long,Long> hm = new TreeMap<Long,Long>(Collections.reverseOrder());
            // for(int i=0;i<n;i++){
            //     hm.put(arr[0][i], arr[1][i]);
            // }
            // ArrayList<Long> keys = new ArrayList<>(hm.keySet());
            // int Totalcount=1;
            // for(int i=1;i<keys.size();i++){
            //     int innerCount = n-1-i;
            //     int temp=i;
            //     while(temp-->0){
            //         if(hm.get(keys.get(i))>hm.get(keys.get(temp))){
            //             innerCount++;
            //         }
            //     }
            //     if(innerCount==n-1){
            //         Totalcount++;
            //     }
            // }
            // System.out.println(Totalcount);


            // ArrayList<PokePow> pArr = new ArrayList<>(n);
            // for(int i=0;i<n;i++){
            //     PokePow pokePow = new PokemonBottles().new PokePow(arr[0][i], arr[1][i]);
            //     pArr.add(pokePow);
            // }
            // Collections.sort(pArr);
            // int Totalcount=1;
            // for(int i=1;i<pArr.size();i++){
            //     int innerCount = n-1-i;
            //     int temp=i;
            //     while(temp-->0){
            //         if(pArr.get(i).water>pArr.get(temp).water){
            //             innerCount++;
            //         }
            //     }
            //     if(innerCount==n-1){
            //         Totalcount++;
            //     }
            // }
           
        }
    }
    class PokePow implements Comparable<PokePow>{
        long ground;
        long water;
        PokePow(long ground,long water){
            this.ground = ground;
            this.water = water;
        }
        @Override
        public int compareTo(PokemonBottles.PokePow o) {
            return -Long.compare(this.ground,o.ground);
        }
    
        @Override
        public String toString() {
            return this.ground+" "+this.water;
        }
    }
    
}



