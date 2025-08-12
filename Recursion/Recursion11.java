import java.util.*;
public class Recursion11 {
    public static String reverse(String s , String rev , int i)
    {
        if(s.length()%2==0)
        {
            if(s.length()-1==i)
            return rev;
            reverse(s, rev, i+2);
            return rev= rev+s.charAt(i+1)+s.charAt(i);
        }
        else
        {
            if(s.length()-1==i)
            return rev = rev+s.charAt(s.length()-1);
            reverse(s, rev, i+1);
            return rev=rev+s.charAt(i+1)+s.charAt(i);
        }
    } 
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any word : ");
        String s=sc.nextLine();
        String rev =reverse(s, "", 0);
        System.out.println(rev);
    }
}
