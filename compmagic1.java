import java.util.Scanner;
public class compmagic1 {
    public static void main(String[]args)
    {
        int m,n,i,a,s=0,k,c=0,d,j=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("m = ");
        m=sc.nextInt();
        System.out.print("n = ");
        n=sc.nextInt();
        if(m>n)
        System.out.println("INVALID INPUT!!!");
        else{
        int A[] = new int[n-m];
        for(i=m;i<=n;i++)
        {
            a=i;
            for(k=1;k<=a;k++)
            {
                if(a%k==0)
                c=c+1;
            }
            do
            {
                s=0;
                while (a!=0) {
                    d=a%10;
                    s=s+d;
                    a/=10;
                }
                a=s;
            }while(a>9);
            if(s==1 && c>2)
            {
                A[j]=i;
                j=j+1;
            }
            c=0;
        }
        System.out.println("THE COMPOSITE MAGIC INTEGERS ARE :");
        {
            for(i=0;i<j;i++)
            {
                if(j<A.length-2)
                  System.out.print(A[i]+",");
               else
                  System.out.println(A[i]);

            }
        }
        System.out.println("FREQUENCY OF COMPOSITE MAGIC INTEGERS : "+j);
        }
    }
}
