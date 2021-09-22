import java.util.Scanner;
import java.util.*;
public class j_v {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the length of the array :- ");
        int n=sc.nextInt();
        int s=0;
        System.out.println("Enter the elements :- ");
        int arr[]=new int[n];
        for (int i : arr )
        {
            i=sc.nextInt();
            s=s+i;

        }
        System.out.println("Average is :- "+(s/n));
    }

}
