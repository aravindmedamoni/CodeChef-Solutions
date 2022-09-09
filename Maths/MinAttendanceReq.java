
//Problem Code:ATTENDU
public class MinAttendanceReq {
    public static void main(String[] args) {
        
        InputReader ir = new InputReader(System.in);
        int t =ir.nextInt(); 
        while(t-->0){
            int n = ir.nextInt();
            String s = ir.next();
            double count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0')
                count++;
            }
            double res = (120-count)*100/120;
            System.out.println(res>=75?"Yes":"No");
        }

    }
}
