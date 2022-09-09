import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = n;
        int nsp = 0;

        for (int r = 1; r<=n; r++){
            for (int sp = 1; sp<=nsp; sp++){
                System.out.print("\t");
            }
            for (int st = 1; st<=nst; st++){
                if(r>1 && r<=n/2 && st>1 && st<nst){
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
            if ( r<= n/2){
                nst-=2;
                nsp++;
            }
            else{
                nst+=2;
                nsp--;
            }
        }
        scn.close();
    }
}
