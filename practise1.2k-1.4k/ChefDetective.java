import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ChefDetective {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i=1;
        Map<Integer,List<Integer>> map = new HashMap<>();
        while (t-->0) {
            int val = sc.nextInt();
            List<Integer> list = map.getOrDefault(val, new ArrayList<>());
            list.add(i++);
            map.put(val,list);
        }
        List<Integer> list = map.values().stream().flatMap((r)->r.stream()).collect(Collectors.toList());
        list.stream().filter((val)->map.get(val)==null).collect(Collectors.toList()).stream().sorted().forEach(val->System.out.print(val+" "));;
        sc.close();
    }
}
