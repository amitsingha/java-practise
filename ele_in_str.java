public class ele_in_str {

    public static int i = 0;
    public static int j = 0;
    public static int k = 0;

    public static void element(String str, Character elem) {
        //int j;
        if(i == str.length()){
            if (k>0) {
                System.out.println(j);
            }
            return;
        }
        if (str.charAt(i) == elem) {
            j = i;
            if(k == 0){
                System.out.print(i+" ");
                k++;
            }
        }
        i++;
        element(str, elem);
    }
    public static void main(String[] args) {
        element("UHeUHjbjvgccccteecehhe", 'e');
    }
}
