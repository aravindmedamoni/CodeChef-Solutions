public class MissingNumbers {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while (t-->0){
            long[] values = new long[4];
            for(int i=0;i<4;i++){
                values[i] = ir.nextLong();
            }
            long a=-1;
            long b =-1;
            if(values[0]>0 && values[1]>0 && values[2]>0 && values[3]>0){
                System.out.println(a+" "+b);
            }else{
                long firstHigh=0;
                long secondHigh=0;
                long min=values[0];
                for(int i=0;i<4;i++){
                    if(values[i]>firstHigh){
                        secondHigh = firstHigh;
                        firstHigh = values[i];
                    }else if(values[i]>secondHigh){
                        secondHigh = values[i];
                    }
                    if(values[i]<0){
                        min = values[i];
                    }
                }
                
               if(secondHigh-firstHigh==1){
                   a = (firstHigh+min)/2;
                   b = firstHigh-a;
               }else{
                a = (secondHigh+min)/2;
                b = secondHigh-a;
               }
               if(b!=0&&((a+b)==values[0] || (a+b)==values[1] || (a+b)==values[2] || (a+b)==values[3]) && ((a-b)==values[0] || (a-b)==values[1] || (a-b)==values[2] || (a-b)==values[3]) && ((a*b)==values[0] || (a*b)==values[1] || (a*b)==values[2] || (a*b)==values[3]) && ((a/b)==values[0] || (a/b)==values[1] || (a/b)==values[2] || (a/b)==values[3])){
                   System.out.println(a+" "+b);
               }else{
                   a=-1;
                   b=-1;
                   System.out.println(a+" "+b);
               }
            }
        }
    }
}
