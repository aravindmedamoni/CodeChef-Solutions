import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TruthDare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            Set<Byte> rTset = new HashSet<>();
            Set<Byte> rDset = new HashSet<>();
            Set<Byte> sTset = new HashSet<>();
            Set<Byte> sDset = new HashSet<>();
            byte tr = sc.nextByte();
            for(byte i=0;i<tr;i++){
                rTset.add(sc.nextByte());
            }
            byte dr = sc.nextByte();
            for(byte i=0;i<dr;i++){
                rDset.add(sc.nextByte());
            }
            byte ts = sc.nextByte();
            for(byte i=0;i<ts;i++){
                sTset.add(sc.nextByte());
            }
            byte ds = sc.nextByte();
            for(byte i=0;i<ds;i++){
                sDset.add(sc.nextByte());
            }
            if(rTset.containsAll(sTset) && rDset.containsAll(sDset)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        sc.close();
    }
}
