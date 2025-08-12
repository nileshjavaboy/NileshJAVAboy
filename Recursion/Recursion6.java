import java.util.*;
public class Recursion6 {
    public static int factorial(int n)
    {
        if(n==1 || n==0)
        return 1;
        int f=factorial(n-1);
        int x=f*n;
        return x;
    }
    public static void main(String[]args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any number : ");
      int n = sc.nextInt();
      int f = factorial(n);
      System.out.println("Factorial : "+f);
    }
}
