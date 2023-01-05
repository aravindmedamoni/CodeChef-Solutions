import java.util.Scanner;

public class Coronavirus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            byte n = sc.nextByte();
            byte minCount=Byte.MAX_VALUE;
            byte maxCount=Byte.MIN_VALUE;
            byte count=0;
            byte val = sc.nextByte();
            boolean flag = true;
            for(int i=0;i<n-1;i++){
                byte nextVal = sc.nextByte(); 
                if(nextVal-val<=2){
                    count++;
                    
                }else{
                    flag=false;
                    if(minCount>count){
                        minCount=count;
                       
                    }
                    if(maxCount<count){
                        maxCount=count;
                        
                    }
                    count=0;
                }
                val=nextVal;  
            }
            if(minCount>count){
                minCount=count;
               
            }
            if(maxCount<count){
                maxCount=count;
                
            }
            if(flag){
                System.out.println(count+1+" "+(count+1));
            }else{
                System.out.println(minCount+1+" "+(maxCount+1));
            }
        }
        sc.close();
    }
}
