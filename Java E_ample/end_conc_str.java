public class end_conc_str {

    public static int i = 0;
    public static int count = 0;
    public static String newStr = "";

    public static void endString(String str, char character){
        if (i == str.length()) {
            for (int j = 0; j < count; j++) {
                newStr+= 'a';
            }
            System.out.println(newStr);
            return;
        }

        if (str.charAt(i) == 'a') {
            
            count++;
            i++;
            endString(str, character);
        } else {
            newStr += str.charAt(i);
            i++;
            endString(str, character);
        }
    }
    public static void main(String[] args) {
        //String newStr = "";
        endString("aadeecar", 'a');
    }
}
