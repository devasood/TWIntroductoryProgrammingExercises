import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by DEVASHISH on 7/15/2016.
 */
public class PrimeFactors {

    public static List<Integer> primefactors(int n){
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <=n ; i++) {
            if (n%i==0){
                list.add(i);
                primefactors(n,i,list);
                break;
            }

        }
        return list;
    }

    public static List<Integer> primefactors(int n,int i,List<Integer> list){
        while(n%i==0){
            n=n/i;
        }
        for (i=i+1; i <=n ; i++) {
            if (n%i==0){
                list.add(i);
                primefactors(n,i,list);
                break;
            }

        }
        return list;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        try{
            System.out.println("Enter a natural number");
            String temp=primefactors(s.nextInt()).toString().substring(1);
            System.out.println(temp.substring(0,temp.length()-1));
        }catch (Exception e){
            System.out.println("Error");
        }

    }
}
