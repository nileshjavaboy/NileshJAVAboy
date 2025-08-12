import java.util.*;
public class pangram {
    public static void main(String[] args) {
        int i,l,count=0;
        String s="";
        char c,d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any word : ");
        s=sc.nextLine();
        s=s.trim();
        s=s.toUpperCase();
        l=s.length();
        for(c='A';c<='Z';c++)
        {
            for(i=0;i<l;i++)
            {
                d=s.charAt(i);
                if(c==d){    
                count=count+1;
                break;
            }
            }
        }
        if(count==26)
        System.out.println("Its a Pangram Sentence : "+s);
        else
        System.out.println("Its not a Pangram sentence : "+s);
    }
}
