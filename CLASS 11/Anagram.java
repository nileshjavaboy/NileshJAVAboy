import java.util.*;
public class Anagram 
    String s1,s2;
        Anagram()
        {
            s1=s2="";
        }
        public static Scanner sc = new Scanner(System.in);
        public void input()
        {
            System.out.print("Enter the first string : ");
            s1 = sc.next();
            System.out.print("Enter the second string :");
            s2 = sc.next();
        }
        public String sort(String s)
        {
            s=s.toLowerCase();
            int i ,k,c1,c2;
            String str="",x="";
            char c,d,t;
            for(i=0 ; i<s.length()-1 ; i++)
            {
                c = s.charAt(i);
                d = s.charAt(i+1);
                for(k=i+1 ; k< s.length(); k++)
                {
                    c1=(int)c;
                    c2=(int)d;
                    if(c1>c2)
                    {
                        t=c;
                        c=d;
                        d=t;
                    }
                }
                str=str+c+d;
            }
            return str;
        }
        public void cal_disp()
        {
            if(sort(s1).equals(sort(s2))==true)
            {
                System.out.println("The Two strings are Anagram");
            }
            else
            {
                System.out.println("The strings are not Anagram");
            }
        }
        public static void main(String[] args) {
            Anagram ob = new Anagram();
            ob.input();
            ob.cal_disp();
        }
}
