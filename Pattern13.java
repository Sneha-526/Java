import java.util.Scanner;
public class Pattern13{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int nst = 1;
        for (int r = 0; r < n; r++) {
        int val = 1;
            for (int j = 0; j < nst; j++) {
                System.out.print(val + "\t");
                val = (val * (r - j))/ (j + 1);
                
            }
            System.out.println();
            nst++;
        }

        scn.close();
    }
} 

