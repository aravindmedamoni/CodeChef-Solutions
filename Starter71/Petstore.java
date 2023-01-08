package Starter71;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Petstore {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] pets = new int[n];
            for(int i=0;i<n;i++){
                pets[i]=sc.nextInt();
            }
            Map<Integer,Integer> pts = new HashMap<>();
            if(n%2==0){
                for(int i=0;i<n;i++){
                    if(pts.containsKey(pets[i])){
                        int v= pts.get(pets[i]);
                        pts.put(pets[i], ++v);
                    }else{
                        pts.put(pets[i], 1);
                    }
                }
                Set<Integer> keys = pts.keySet();
                boolean flag=true;
                for(Integer key:keys){
                    if(pts.get(key)%2!=0){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
