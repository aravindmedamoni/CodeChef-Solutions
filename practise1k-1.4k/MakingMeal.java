import java.util.Scanner;

public class MakingMeal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            byte n = sc.nextByte();
            short[] arr = new short[6];
            for(byte i=0;i<n;i++){
                String s = sc.next();
                for(int j=0;j<s.length();j++){
                    switch (s.charAt(j)) {
                        case 'c':
                            arr[0]+=1;
                            break;
                        case 'o':
                            arr[1]+=1;
                            break;
                        case 'd':
                            arr[2]+=1;
                            break;
                        case 'e':
                            arr[3]+=1;
                            break;
                        case 'h':
                            arr[4]+=1;
                            break;
                        case 'f':
                            arr[5]+=1;
                            break;
                        default:
                            break;
                    }
                }
            }
            arr[0]=Short.valueOf(String.valueOf(arr[0]/2));
            arr[3]=Short.valueOf(String.valueOf(arr[3]/2));
            int min=arr[0];
            for(byte i=1;i<arr.length;i++){
                min = Math.min(arr[i], min);
            }
            System.out.println(min);
        }
        sc.close();
    }
}
