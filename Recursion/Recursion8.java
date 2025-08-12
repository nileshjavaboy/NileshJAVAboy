public class Recursion8 {
    public static void main(String[] args) {
        System.out.println(power(5));    
    }
    public static int power(int n)
    {
        if(n==0)
            return 1;
        else
            return 2*power(n-1);    
            
    }

}
