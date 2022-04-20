public class recu_fac {
    
    public static void factorial(int n, int m){
        if(n>=0){
            if (n == 0) {
                System.out.println(m);
                return;
            }
            m = m * n;
            factorial(n-1 , m);
            }
        else{
            System.out.println("Invalid Number!");
        }
    }

    public static void main(String[] args) {
        factorial( -5, 1);
    }
}
