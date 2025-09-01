import java.util.*;
public class kaprekar {
    int p,q,a[],x;
    kaprekar(int pp,int qq)
    {
        p=pp;
        q=qq;
        a=new int[50];
        x=0;
    }
    public static Scanner sc = new Scanner(System.in);
    public int count(int m)
    {
        String s="";
        s=Integer.toString(m);
        return s.length();
    }
    public void caldisp()
    {
        int i,l,sq,y,lp,rp;
        for(i=p;i<=q;i++)
        {
            l=this.count(i);  // current object under consideration 
            sq=i*i;
            y=(int)Math.pow(10, l);
            lp=sq/y;
            rp=sq%y;
            if(lp+rp==i)
            a[x++]=i;
        }
        if(x>0)
        {
            System.out.println("THE KAPREKAR NUMBERS ARE :");
            for(i=0;i<x;i++)
            {
                if(i==x-1)
                System.out.println(a[i]);
                else
                System.out.print(a[i]+",");
            }
            System.out.println("THE FREQUENCY OF KAPREKAR NUMBER IS :"+x);
        }
        else
        System.out.println("OUTPUT:\t NO KAPREKAR NUMBER FOUND");
    }
    public static void main(String[] args) {
        int pp,qq;
        System.out.println("INPUT :");
        System.out.print("p = ");
        pp=sc.nextInt();
        System.out.print("q = ");
        qq=sc.nextInt();
        kaprekar ob = new kaprekar(pp, qq);
        ob.caldisp();
    }
}
