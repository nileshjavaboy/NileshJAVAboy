import java.util.*;
class Recursion10{
   char x;
   public static boolean check(String s,char x,int ind)
   {
      if(ind >= s.length()-1)
         return true;
      if(s.charAt(ind) != x)
         return false;
      return check(s, x, ind+1);
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any word : ");
      String s = sc.nextLine();
      System.out.println(check(s, s.charAt(0), 0));
   }
}