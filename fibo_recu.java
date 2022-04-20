public class fibo_recu {
    public static void fibonacci(int c, int i, int j){
        if (i >= c) {
            return;
        }
/*
        if (i==0 && j == 1) {
            System.out.println("0");
            //System.out.println("1");
        }
*/
        System.out.println(i);
        int temp = j;
        j = i+j;
        i = temp;

        //System.out.println(i);
        fibonacci(c, i, j);
        //System.out.println(i);
        //if (i==0 && j == 1) {
        //    System.out.println("0");
         //   //System.out.println("1");
        //}
    }

    public static void main(String[] args) {
        fibonacci(10, 0,1);
    }
}
