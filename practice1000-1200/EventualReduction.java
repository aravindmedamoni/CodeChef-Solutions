
//Problem Code:EVENTUAL
public class EventualReduction {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            String s = ir.next();
            int[] a = new int[26];
            for(int i=0;i<n;i++){
                a[s.charAt(i)-'a']++;
            }
            int i=0;
            for(;i<26;i++){
                if(a[i]%2!=0){
                    System.out.println("NO");
                    break;
                }
            }
            if(i==26){
                System.out.println("YES");
            }
        }
    }
}
