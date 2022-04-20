public class rem_dup {

    public static boolean[] map = new boolean[26];
    public static int i = 0;
    public static String newStr = "";

    public static void removeDuplicates(String str ) {
        if (i == str.length()) {
            
            System.out.println(newStr);
            return;
        }
        char c = str.charAt(i);
        int n = c - 'a';
        //System.out.println(n);
        if (map[n] == true) {
            
            i++;
            removeDuplicates(str);
        } else {
            newStr += c;
            map[n] = true;
            i++;
            removeDuplicates(str);
        }
    }
    public static void main(String[] args) {
        removeDuplicates("ajbffdfcfcgca");
    }
}
