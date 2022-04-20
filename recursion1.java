/**
 * Innerrecursion1
 */
class Innerrecursion1 {
    int sum;
    public static void printNum(int n , int con,int sum) {
        if (n == con+1) {
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        //System.out.println(n );
        
        printNum(n+1, con, sum);

    }
}

public class recursion1 {
    public static void main(String[] args) {
        Innerrecursion1 inr = new Innerrecursion1();
        inr.sum = 0;
        inr.printNum(1 ,10, 0);
        
    }
}
