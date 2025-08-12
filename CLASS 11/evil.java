import java.util.*;
public class evil {
    int n,c;
    evil()
    {
        n=c=0;
    }
    public static Scanner sc = new Scanner(System.in);
    public void input()
    {
        System.out.print("Enter any number : ");
        n = sc.nextInt();
        count(n);
    }
    public int count(int n)
    {
        int a=n,d=0;
        while(a>0)
        {
            d=d%2;
            if(d==1)
            c=c+1;
            a=a/2;
        }
        return c;
    }
    public void check()
    {
        if(c%2==0)
        System.out.println("Its a Evil number !");
        else
        System.out.println("Its not a Evil number !");
    }
    public static void main(String[] args) {
        evil ob = new evil();
        ob.input();
        ob.check();
    }
}
