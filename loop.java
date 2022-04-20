import java.util.*;

public class loop {
    public static void main(String[] args) {
        int i, j=0, k=0;
        for(i = 0; i<= 10; i++){
            if (i<10) {
                System.out.println(i);
            }
        }
        while (j<11) {
            System.out.println(j);
            j++;
        
        }
        do {
            System.out.println("k : "+k);
            k++;
        } while (k>11);
        int sum = 0;
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        for(i=1; i<n+1; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
