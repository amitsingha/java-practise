import java.util.*;

public class func {
    public static int sums(int a, int b){
        //System.out.println(name);

        return a + b;
    }
    public static int factorial(int n){
        
        int factor = 1, i=1;
        //for(int i=1; i<n+1; i++){
        //    factor = factor * i;
        //}
        do{
            factor = factor * i;
            i++;
        }while(i<n+1);
        return factor;
    }
   public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int a = r.nextInt();
        int b = r.nextInt();
        int n = r.nextInt();
        if (n<0) {
            System.out.println("Invalid");
            return;
        }
        System.out.println(sums(a,b));
        System.out.println("Factorial of "+n+" = "+factorial(n));
    }
}
