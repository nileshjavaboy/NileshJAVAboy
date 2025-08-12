import java.util.*;
public class Recursion12 {
    public static boolean triangular(int n,int s,int i){
        if(s==n)
        return true;
        if(s>n || s!=n)
        return false;
        triangular(n, s, i+1);
        s=s+i;
        return true;
        }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n=sc.nextInt();
        boolean s=triangular(n, 0, 1) ;
        if(s==true)
        System.out.println("It's a Triangular number");
        else
        System.out.println("It's not a Triangular number");
    }
}
