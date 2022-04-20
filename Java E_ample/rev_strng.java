public class rev_strng {

    public static void reverse(String str, int i){
        System.out.print(str.charAt(str.length() - i));
        if (i == str.length()) {
            System.out.println("");
            return;
        }

        i++;
        reverse(str, i);
    }
    public static void main(String[] args) {
        
        reverse("aft lsd", 1);
    }
}
