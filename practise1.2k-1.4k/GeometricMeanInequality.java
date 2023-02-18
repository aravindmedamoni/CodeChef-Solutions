import java.util.Scanner;

public class GeometricMeanInequality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while (t-->0) {
            int n = sc.nextInt();
            int posCount=0;
            int negCount=0;
            for(int i=0;i<n;i++){
                byte val = sc.nextByte();
                if(val==-1){
                    negCount++;
                }else{
                    posCount++;
                }
            }
            String ans="No";
            if((posCount&1)!=0 && (negCount&1)!=0){
               // System.out.println("if Pos "+posCount+" neg "+negCount);
                ans="No";
            }else if((posCount&1)==0 && (negCount&1)==0){
              //  System.out.println("Pos "+posCount+" neg "+negCount);
                if(Math.abs(negCount-posCount)>2){
                    ans="No";
                }else{
                    ans="Yes";
                }
            } else
            //(((posCount&1)==0 && (negCount&1)!=0) || ((posCount&1)!=0 && (negCount&1)==0))
            {
               // System.out.println("else Pos "+posCount+" neg "+negCount);
                if(Math.abs(negCount-posCount)>1){
                    ans="No";
                }else{
                    ans="Yes";
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
