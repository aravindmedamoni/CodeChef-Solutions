
//problem code:ALTSTR
public class AlternatingSubString {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            String s = ir.next();
            int count1 = 0;
            int count0=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1'){
                    count1++;
                }else{
                    count0++;
                }
            }
            int min = Math.min(count0, count1);
            if(count0 == 0 || count1 ==0){
                System.out.println(1);
            }else if(min==count0){
                if(min==count1){
                    System.out.println(min+min);
                }else if(min+1<=count1){
                    System.out.println(min+min+1);
                }
            }else if(min==count1){
                if(min==count0){
                    System.out.println(min+min);
                }else if(min+1<=count0){
                    System.out.println(min+min+1);
                }
            }
        }
    }
}
