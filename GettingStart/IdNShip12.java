import java.util.Scanner;

public class IdNShip12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            switch(sc.next()){
                case "B": 
                case "b":
                System.out.println("BattleShip");
                break;
                case "C": 
                case "c":
                System.out.println("Cruiser");
                break;
                case "D": 
                case "d":
                System.out.println("Destroyer");
                break;
                case "F": 
                case "f":
                System.out.println("Frigate");
                break;
            }
        }
        sc.close();
    }
}
