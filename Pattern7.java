import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int r = 1; r <= n; r++) {
            for (int i = 1; i <= n; i++){
                if (r == i){              
                    System.out.print("*\t");
                    break;
                }
                else{                       
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        scn.close();
    }
    
}
