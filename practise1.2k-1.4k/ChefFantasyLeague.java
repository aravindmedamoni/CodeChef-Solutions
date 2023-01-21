import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ChefFantasyLeague {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            byte n = sc.nextByte();
            byte s = (byte)(100-sc.nextByte());
            byte[] players = new byte[n];
            byte[] costs = new byte[n];
            for(int i=0;i<n;i++){
                players[i]=sc.nextByte();
            }
            for(int i=0;i<n;i++){
                costs[i]=sc.nextByte();
            }
            byte d=Byte.MAX_VALUE;
            byte f = Byte.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(costs[i]==0){
                    if(players[i]<d){
                        d=players[i];
                    }
                }else{
                    if(players[i]<f){
                        f=players[i];
                    }
                }
            }
            if(f+d>s){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
            // Map<Byte,ArrayList<Byte>> map = new HashMap<>();
            // for(int i=0;i<n;i++){
            //     if(map.containsKey(costs[i])){
            //         map.get(costs[i]).add(players[i]);
            //     }else{
            //         map.put(costs[i], new ArrayList<Byte>());
            //         map.get(costs[i]).add(players[i]);
            //     }
            // }
            // map.get((byte)0).trimToSize();
            // map.get((byte)1).trimToSize();
            // Collections.sort(map.get((byte)0));
            // Collections.sort(map.get((byte)1));
            // if(map.get((byte)0).get(0)+map.get((byte)1).get(0)>s){
            //     System.out.println("no");
            // }else{
            //     System.out.println("yes");
            // }

        }
        sc.close();
    }
}

// Scanner sc = new Scanner(System.in);
//         byte t = sc.nextByte();
//         while (t-->0) {
//             byte n = sc.nextByte();
//             byte s = (byte)(100-sc.nextByte());
//             byte[] players = new byte[n];
//             byte[] costs = new byte[n];
//             for(int i=0;i<n;i++){
//                 players[i]=sc.nextByte();
//             }
//             byte count=0;
//             for(int i=0;i<n;i++){
//                 costs[i]=sc.nextByte();
//                 if(costs[i]==0){
//                     count++;
//                 }
//             }
//             byte[] defenders = new byte[count];
//             byte[] forwards = new byte[n-count];
//             byte k=0;
//             byte j=0;
//             for(int i=0;i<n;i++){
//                 if(costs[i]==0)
//                 defenders[j++]=players[i];
//                 else
//                 forwards[k++]=players[i];
//             }
//             Arrays.sort(defenders);
//             Arrays.sort(forwards);
//             if(defenders[0]+forwards[0]>s){
//                 System.out.println("no");
//             }else{
//                 System.out.println("yes");
//             }

//         }
//         sc.close();
