import java.util.*;
class kaprekar{
    int p,q,f,A[];
    kaprekar(int p1, int q1)
    {
        p=p1;
        q=q1;
        f=0;
        A = new int[q-p];
    }
    public static Scanner sc = new Scanner(System.in);
    public int digitcount(int n)
    {
        int a,d=0,c=0;
        a=n;
        while(a>0)
        {
            d = a%10;
            c=c+1;
            a=a/10;
        }
        return c;
    }
    public boolean calculate(int n)
    {
}
