import java.util.*;

public class inp_out {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int a = r .nextInt();
        //Scanner s = new Scanner(System.in);
        int b = r .nextInt();

        float sum = a + b;
        System.out.println(sum);

        if(sum > 18){
            System.out.println("Adult.");
        }
        else{
            System.out.println("Not Adult.");
        }

        if(sum % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        if (a == b) {
            System.out.println("a is equal to b.");
        }else if (a>b) {
            System.out.println("a is greater then b");
        } else {
            System.out.println("a is less then b.");
        }

        switch (a) {
            case 1:
                System.out.println("hI");
                break;
            case 2:
                System.out.println("UHello");
                break;
            case 3:
                System.out.println("Morning");
                break;
            default:
                System.out.println("Failed");
        }
    }

}
