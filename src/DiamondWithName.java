import java.util.Scanner;

/**
 * Created by DEVASHISH on 7/15/2016.
 */
public class DiamondWithName {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter natural number n:");
        try{
            int t=s.nextInt();
            for (int i = 0; i <t-1 ; i++) {
                for (int j = t-i-2; j >=0 ; j--) {
                    System.out.print(" ");
                }

                for (int j = 0; j <2*i+1 ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println("Devashish");

            for (int i = 0; i <t-1 ; i++) {
                for (int j = 0; j <=i ; j++) {
                    System.out.print(" ");
                }
                for (int j = 2*(t-i-2)+1; j >0 ; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }catch(Exception e){System.out.println("Error");}

    }
}
