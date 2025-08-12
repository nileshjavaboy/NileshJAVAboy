import java.util.*;
public class matrix
{
    int A[][];
    public void calculate(int r,int c,int m,int n)
    {
        int i,k,rr=0,cc=0; 
        
        A = new int[r][c]; 
        for(i=0;i<r;i++)
        {
            for(k=0;k<c;k++)
            {
                A[r][c] = A[m][n];
            }
            
        }

    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)
    {
        int r,c,m,n,i,k;
        System.out.print("Enter the no. of rows: ");
        m = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.print("Enter rows of Reshape Dimension :");
        r = sc.nextInt();
        System.out.print("Enter columns of Reshape Dimension :");
        c= sc.nextInt();
        if(m*n == r*c)
        {
        System.out.println("Enter the elements:");
        for(i=0;i<m;i++)
        {
            for(k=0;k<n;k++)
            {
                a[m][n] = sc.nextInt();
            }
        }
            matrix ob = new matrix();
            ob.calculate(r, c,m,n);

        }
        else
        {
            System.out.println("Invalid Dimension!");
        }
      }
}
