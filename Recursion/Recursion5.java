import java.util.*;
public class Recursion5 {

    public static void fibo(int a , int b , int n)
    {
        int sum;
        if(n==0)
            return;
        sum=a+b;
        System.out.println(sum);
        fibo(b , sum , n-1);
    }
    public static void main(String[]args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of terms : ");
       int n = sc.nextInt();
       System.out.println(0);
       System.out.println(1);
       fibo(0, 1, n-2);
    }
}