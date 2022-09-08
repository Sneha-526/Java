import java.util.Scanner;

public class AllPrimesTillN {
    
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter The Lowest Number: ");
        int low = scn.nextInt();
        System.out.println("");
        System.out.print("Enter The Highest Number: ");
        int high = scn.nextInt();
        System.out.println("\n");
        System.out.print("Here are your prime numbers between " +low+ " and " +high+ ": ");
        System.out.println(" ");
        for(int n=low; n <= high; n++){
            int count = 0;
            for(int div = 2; div * div <=n; div++){
                if (n % div == 0){
                    count++;
                    break;
                }
            }
            
            if (count == 0){
                System.out.println(n);
            }
            
        }
        scn.close();
    }
}
