import java.util.*;
class Emirp{
    int n ;
    Emirp()
    {
      n = 0;
    }
    public static Scanner sc = new Scanner(System.in);
    public void input()
    {
        System.out.println("Enter any number :");
        n = sc.nextInt();
    }
    public int reverse(int x)
    {
        int a,d ,rev=0;
        a=x;
        while(a>0)
        {
            d=a%10;
            rev = rev *10+d;
            a=a/10;
        }
        return rev;
    }
    public boolean Isprime(int x)
    {
        int i,c=0;
        for(i=1;i<=x;i++)
        {
            if(x%i==0)
            c=c+1;
        }
        if(c==2)
        return true;
        else
        return false;
    }
    public void display()
    {
        int a = reverse(n);
        if(Isprime(n)==true &&  Isprime(a)==true)
        System.out.println(n+ " is a twisted number ");
        else    
        System.out.println(n+" is not a twisted number ");
    }
    public static void main(String[]args)
    {
        Emirp ob = new Emirp();
        ob.input();
        ob.display();
    }
}