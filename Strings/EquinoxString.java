

//problem code:EQUINOX
public class EquinoxString {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            long A = ir.nextInt();
            long B = ir.nextInt();
            long sCount=0;
            long aCount=0;
            while(n-->0){
                String s = ir.next();
                if(s.charAt(0)=='E' || s.charAt(0)=='Q' || s.charAt(0)=='U' || s.charAt(0)=='I' || s.charAt(0)=='N' || s.charAt(0)=='O' || s.charAt(0)=='X'){
                 sCount +=A;   
                }else{
                    aCount +=B;
                }
            }

            if(sCount>aCount){
                System.out.println("Sarthak".toUpperCase());
            }else if(sCount<aCount){
                System.out.println("Anuradha".toUpperCase());
            }else{
                System.out.println("draw");
            }
        }
    }
}

// class InputReader{
//     private BufferedReader br;
//     InputReader(InputStream is){
//         br = new BufferedReader(new InputStreamReader(is));
//     }
//     private StringTokenizer st;
//     public String nextLine(){
//         String s=null;
//         try {
//             s = br.readLine();
//         } catch (Exception e) {
           
//         }
//         return s;
//     }
//     public String next(){
//         if(st == null || !st.hasMoreTokens()){
//             try {
//                 st = new StringTokenizer(br.readLine());
//             } catch (Exception e) {
//                 System.out.println(e.getMessage());
//             }
//         }
//         return st.nextToken(" ");
//     }

//     public int nextInt(){
//         return Integer.parseInt(next());
//     }

//     public long nextLong(){
//         return Long.parseLong(next());
//     }

//     public double nextDouble(){
//         return Double.parseDouble(next());
//     }
// }


