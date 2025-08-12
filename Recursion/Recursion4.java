import java.util.*;
public class Recursion4 {
     public static void fact(int i , int n , int f)
     {
        if(n==i)
        {
            f=f*i;
            System.out.println("Factorial : "+f);
            return;
        }
        f=f*i;
        fact(i+1 , n , f);
     }
    public static void main(String[]args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        fact(1 , n , 1);
     } 
     
}
