import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = n;
        for (int r = 1; r<=n; r++){
            for (int st = 1; st<=nst; st++){
                System.out.print("*\t");

            }
            System.out.println();
            nst--;
        }
        scn.close();
    }
}
