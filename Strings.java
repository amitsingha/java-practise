import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name+" Length is : "+name.length());

        for (int i=0; i<name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        String substr = name.substring(1);
        System.out.println(substr);

        //StringBuilder
        StringBuilder str = new StringBuilder("This is me.");
        str.setCharAt(2, 'T');
        //str.setCharAt(2, 'L');
        System.out.println(str);
        str.insert(0, "ME ");
        System.out.println(str);
        str.delete(0, 3);
        System.out.println(str);
        str.append(str);
        System.out.println(str);

        StringBuilder stre = new StringBuilder();
        char sret;
        for (int i = str.length()-1; i>= 0; i--) {
            sret = str.charAt(i);
            //System.out.println(sret);
            stre.append(sret);
            //System.out.println(stre);
        }
        System.out.println(stre);
    }
}
