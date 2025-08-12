 import java.util.*;
 class name{
    public static void main(String[]args)
    {
        int i,p;
        char c,d;
        String s="",a="",x="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any name:");
        s=sc.nextLine();
        s=s.trim();
        s=s.toUpperCase();
        s=" "+s;
        p=s.lastIndexOf(' ');
        x=s.substring(p+1);
        for(i=0;i<p;i++)
        {
            c=s.charAt(i);
            if(c==' ')
            {
                d=s.charAt(i+1);
                a=a+d+".";
            }
        }
        a=a+x;
        System.out.println("Output:"+a);
    }
}