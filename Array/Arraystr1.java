import java.util.*;
public class Arraystr1 {
    public static void main(String[] args) {
        int i,j,n,k,f,x=0;
        char c,d;
        Scanner sc = new Scanner (System.in); 
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the number of names : "); 
        n=sc1.nextInt();
        String A[]=new String[n];
        System.out.println("Enter the names :");
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextLine(); 
        }
    for(j=0;j<A[0].length();j++)
    {
        d=A[0].charAt(j);
        f=1;
        for(i=1;i<n;i++)
        {
            for(k=0;k<A[i].length();k++)
            {
                c=A[i].charAt(k);
                if(c==d)
                f=f+1;
            }
        }
        if(f>=n)
        x=x+1;
    }
    System.out.println("No. of common letters : "+x);
  }
}
