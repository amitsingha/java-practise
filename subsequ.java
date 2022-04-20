import java.util.HashSet;

public class subsequ {

    public static int i = 0;
    public static String newStr = "";

    public static void subSequence(String str,int i, String newStr, HashSet<String> set){

        if (i == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
            
        }
        char c = str.charAt(i);

        subSequence(str,i+1, newStr + c, set);
        subSequence(str, i+1, newStr, set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        subSequence("aaa", 0, "", set);
    }
}
