import java.util.Scanner;

/**
 * Created by DEVASHISH on 7/15/2016.
 */
public class DrawAHorizontalLine {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter natural number n:");
        try{
            int t=s.nextInt();
            for (int i = 0; i <t ; i++) {
                System.out.print("*");
            }
        }catch(Exception e){System.out.println("Error");}

    }
}
