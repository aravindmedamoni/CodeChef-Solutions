import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CleaningUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            StringBuffer chef = new StringBuffer();
            StringBuffer assist = new StringBuffer();
            Boolean isBoolean=true;
            Set<Integer> arr = new HashSet<>(m);
            for(int i=0;i<m;i++){
                arr.add(sc.nextInt());
            }
            for(int i=1;i<=n;i++){
                if(!arr.contains(i)){
                    if(isBoolean){
                        isBoolean = !isBoolean;
                        chef.append(i+" ");
                    }else{
                        isBoolean = !isBoolean;
                        assist.append(i+" ");
                    }
                }
            }
            System.out.println(chef.length()>0?chef:-1);
            System.out.println(assist.length()>0?assist:-1);
        }
        sc.close();
    }
}
