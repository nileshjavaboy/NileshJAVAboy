import java.util.*;
public class matrix1 {
    public static void main(String[]args)
    {
        int a[][],A[][],i,k,mm,nn,r,c,m,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        m = sc.nextInt();
        System.out.print("Enter the no. of columns : ");
        n = sc.nextInt();
        System.out.print("Enter the rows of Reshape Dimension : ");
        r = sc.nextInt();
        System.out.print("Enter the columns of Reshape Dimension : ");
        c = sc.nextInt();
        if( m*n == r*c)

        {
            A = new int [m][n];
            System.out.println("Enter the elements :");
            for(i=0;i<m;i++)
            {
                for(k=0;k<n;k++)
                {
                    A[i][k] = sc.nextInt();
                }
            }
            a = new int[r][c];
            mm=0;nn=0;
            for(i=0;i<m;i++)
            {
                for(k=0;k<n;k++)
                { 
                    if(nn==c-1)
                    nn=0;
                    else
                    nn++;
                    a[mm][nn] = A[i][k];
                }
                if(mm==m-1)
                break;
                else
                mm++;
                
            }
            System.out.println("The Original matrix : ");
            for(i=0;i<m;i++)
            {
                for(k=0;k<n;k++)
                {
                    System.out.print(A[i][k]+"\t");
                }
                System.out.println();
            }
            System.out.println("The Reshape Matrix : ");
            for(i=0;i<r;i++)
            {
                for(k=0;k<c;k++)
                {
                    System.out.print(a[i][k]+"\t");
                }
                System.out.println();
            }
        }

        else{
            System.out.println("Invalid Dimension!");
        }

    }
}
