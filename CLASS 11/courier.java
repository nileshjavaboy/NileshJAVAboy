import java.util.*;
class courier {
    int wt,amt;
    courier()
    {
        wt=0;
        amt=0;
    }
    public static Scanner sc = new Scanner(System.in);
    public void input()
    {
        System.out.print("Enter the weight of your parcel :");
        wt = sc.nextInt();
    }
    public void calculate()
    {
        int a,x;
        if(wt<=20)
        amt=120;
        else
        {
            x=wt-20;
            if(x%10==0)
            a=x/10;
            else
            a=(x/10)+1;
            amt = 120 + (a*50);
        }
    }
        public void display()
        {
            System.out.println("Weight of Parcel : "+wt);
            System.out.println("Amount to be paid : "+amt);
        }
        public static void main(String[]args)
        {
            courier ob = new courier();
            ob.input();
            ob.calculate();
            ob.display();
        }
    }
    