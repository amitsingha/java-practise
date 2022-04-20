import java.util.ArrayList;
import java.util.Collections;


public class arra_list_ds {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        list.add(3, 4);
        System.out.println(list);

        int element = list.get(1);
        System.out.println(element);

        list.add(0,2);
        System.out.println(list);

        list.set(0,3);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
}}
