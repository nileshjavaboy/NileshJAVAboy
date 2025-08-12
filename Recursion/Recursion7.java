import java.util.*;
public class Recursion7 {
    public static int power(int n)
    {
        if(n==0)
        return 1;
       
        int f=power(n-1);
        int  p=f*2;
        return p;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();
        int p=power(n);
        System.out.println("Output :"+p);
    }
}
