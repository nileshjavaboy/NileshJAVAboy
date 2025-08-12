import java.util.*;
public class Sample1 {
    int n,m,A[],p;
    Sample1(int mm, int nn)
    {
        n=nn;
        m=mm;
        A=new int[n-m];
        p=0;
    }
    public boolean isComposite(int x)
    {
        int i,c=0;
        for(i=1;i<=x;i++)
        {
            if(x%i==0)
            c=c+1;  // counting factors
        }
        if(c>2)
            return true;
        else
            return false;
    }
    public boolean isMagic(int x)
    {
        int d,a,s;
        a=x;
        do{
            s=0;
            while(a>0)
            {
                d=a%10;
                s=s+d;
                a=a/10;
            }
            a=s;
        }while(s>9);
        if(s==1)
        return true;
        else
        return false;
    }
    public static Scanner sc = new Scanner(System.in);
    public void cal_disp()
    {
        int i;
        for(i=m;i<=n;i++)
        {
            if(isComposite(i)==true && isMagic(i)==true)
            {
                A[p++]=i;
            }
        }
        if(p>0){
        System.out.println("OUTPUT:\tTHE COMPOSITE MAGIC INTEGERS ARE:");
        System.out.print("\t");
        for(i=0;i<p;i++)
        {
            if(i<p-1)
            System.out.print(A[i]+",");
            else
            System.out.println(A[i]);
        }
        System.out.println("\tFREQUENCY OF MAGIC INTEGERS ARE:"+p);
        }
      else
     {
        System.out.println("\tNO COMPOSITE MAGIC INTEGERS ARE THERE");
     }
    }
    public static void main(String[] args) {
        int nn,mm;
        System.out.print("INPUT:\tm = ");
        mm=sc.nextInt();
        System.out.print("\tn = ");
        nn=sc.nextInt();
        if(mm<nn)
        {
            Sample1 ob = new Sample1(mm, nn);
            ob.cal_disp();
        }
        else
        {
            System.out.println("\tINVALID INPUT");
        }
    }
}

