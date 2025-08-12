import java.util.*;
public class magic {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int i,d,a,n,m,s;
        System.out.print("n = ");
        n=sc.nextInt();
        System.out.print("m = ");
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            a=i;
            do
            {
                s=0;
                while(a>0)
                {
                    d=a%10;
                    s=s+d;
                    a/=10;
                }
                a=s;
            }while(a>9);
            if(a==1)
            System.out.println(i);
        }

    }
}
