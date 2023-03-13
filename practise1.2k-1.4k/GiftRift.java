
import java.util.Scanner;

public class GiftRift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte r = sc.nextByte();
        byte c = sc.nextByte();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        boolean flag=false;
        int minMax=-1;
        for(byte i=0;i<r;i++){
            byte cIndex=-1;
            int min = Integer.MAX_VALUE;
            for(byte j=0;j<c;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                    cIndex=j;
                }
            }
            while(cIndex<c){
                for(byte temp=0;temp<r&& arr[i][cIndex]==min;temp++){
                  //  System.out.println("min "+min+"cIn "+cIndex);
                    if(arr[temp][cIndex]>min){
                        flag=true;
                        break;
                    }else{
                        flag=false;
                    }
                }
                cIndex++;
                if(!flag)
                break;
            }
            minMax=min;
            if(!flag){
                break;
            }
            
        }
        if(flag){
            System.out.println("GUESS");
        }else{
            System.out.println(minMax);
        }
        sc.close();
    }
}
