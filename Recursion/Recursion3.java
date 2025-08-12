import java.util.*;
public class Recursion3 {
    public static void num(int i ,int n , int sum)
    {
        if(n==i)
        {
            sum+=i;
            System.out.println("Sum of natural numbers:"+sum);
            return;
        }
        sum+=i;
        num(i+1 , n , sum);
    }
    @SuppressWarnings("resource")
    public static void main(String[]args)
    {
        @SuppressWarnings("")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n=sc.nextInt();
        num(1,n,0);

    }
    
}
