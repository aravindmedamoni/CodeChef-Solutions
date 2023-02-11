import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            byte w = sc.nextByte();
            byte[] days = {4,4,4,4,4,4,4};
            String s = sc.next();
            switch (s) {
                case "mon":
                    increment(days, w, (byte)0);
                    break;
                case "tues":
                    increment(days, w, (byte)1);
                    break;
                case "wed":
                    increment(days, w, (byte)2);
                    break;
                case "thurs":
                    increment(days, w, (byte)3);
                    break;
                case "fri":
                    increment(days, w, (byte)4);
                    break;
                case "sat":
                    increment(days, w, (byte)5);
                    break;
                default:
                increment(days, w, (byte)6);
                    break;
            }
            for(byte b:days){
                System.out.print(b+" ");
            }
            System.out.println();

        }
        sc.close();
    }
    static void increment(byte[] arr,byte w,byte pos){
        byte rem =(byte)(w%7);
        while(rem-->0){
            pos=(byte)(pos%7);
            arr[pos++]++;
        }
        //return arr;
    }
}
