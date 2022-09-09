import java.util.Scanner;

public class Pattern15 {

   public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        int nsp = n/2;
        int val = 1;

        for (int r = 1; r<=n; r++){
            for (int sp = 1; sp<=nsp; sp++){
                System.out.print("\t");

            }
            int v = val;
            for (int st = 1; st<=nst; st++){
                System.out.print(v + "\t");
                if (st<=nst/2){
                    v++;
                }
                else{
                    v--;
                }

            }
            System.out.println();
            if (r<=n/2){
                nst = nst+2;
                nsp--;
                val++;
            }
            else{
                nst-=2;
                nsp++;
                val--;
            }
        }
        scn.close();
    }
}