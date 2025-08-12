import java.util.*;
public class binary {
    int n,b;
    binary()
    {
        n=b=0;
    }
    public static Scanner sc = new Scanner(System.in);
    public void input()
    {
        System.out.print("Enter the number : ");
        n = sc.nextInt();
    }
    public void calculate()
    {
        int a,d,rev = 0,rev1=0;
        a=n;
        int f = 0, cz = 0;
        // First, get reversed binary
        while (a > 0) {
            d = a % 2;
            if(d != 0){
                f = 1;
            }
            else if(f == 0)
                cz += 1;
            rev = rev * 10 + d;
            a = a / 2;
        }
  
    // Now, reverse it again to get correct binary
        a = rev;
        while (a > 0) {
            d = a % 10;
            rev1 = rev1 * 10 + d;
            a = a / 10;
        }
        
        b = rev1*(int)Math.pow(10,cz);
    }

    public void display()
    {
        System.out.print("The binary equivalent : "+b);

    }
    public static void main(String[]args)
    {
        binary ob = new binary();
        ob.input();
        ob.calculate();
        ob.display();
    }
}

